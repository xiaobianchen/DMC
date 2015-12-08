package com.dmc.crawler;

import com.dmc.domain.entity.Product;
import com.dmc.utils.JDBCHelper;
import com.dmc.utils.JsonToMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Kyle
 * @version 1.0 2015/12/06
 */
public class ProductCrawler {
    JdbcTemplate jdbcTemplate = null;
    //public static String productDetailCSSSelector = "#J_ParamsWrap div div:nth-child(2) ul";

    public ProductCrawler() {
        init();
    }

    public void init() {
		try{
			jdbcTemplate = JDBCHelper.createMysqlTemplate("mysql1",
                    "jdbc:mysql://localhost/dmc?useUnicode=true&characterEncoding=utf8",
                    "root", "", 5, 30);

            jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS `product` (\n" +
                    "            `productId` varchar(255) DEFAULT NULL,\n" +
                    "            `title` varchar(255) DEFAULT NULL,\n" +
                    "            `brand` varchar(255) DEFAULT NULL,\n" +
                    "            `brandId` varchar(255) DEFAULT NULL,\n" +
                    "            `onSaleTime` varchar(255) DEFAULT NULL,\n" +
                    "            `saleChannel` varchar(255) DEFAULT NULL\n" +
                    "            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;");

            System.out.println("成功创建表product");
		}catch(Exception e){
		    jdbcTemplate  = null;
		    System.out.println("数据库用户名或密码不正确");
		}
        System.out.println("数据库连接成功");
	}

    @SuppressWarnings("unchecked")
    public void crawlProductPage(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            String shopInfo = doc.body().toString();

            //String regex="(TShop.Setup\\()([\\s\\S]*)(\\);\\n}\\)\\(\\);)";
            String regex = "TShop.Setup([\\w\\W]*)(\\)\\(\\);)";
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(shopInfo);

            m.find();
            shopInfo = m.group();
            shopInfo = shopInfo.substring(shopInfo.indexOf("TShop.Setup") + "TShop.Setup".length(), shopInfo.indexOf("})();"));
            shopInfo = shopInfo.substring(1, shopInfo.length() - 4);
            //System.out.println(shopInfo);

            Map<String, Object> productInfo = (Map<String, Object>)(JsonToMap.toMap(shopInfo).get("itemDO"));

            Product product = new Product();
            product.setBrandId(productInfo.get("brandId").toString().replace("\"", ""));
            product.setItemId(productInfo.get("itemId").toString());
            product.setTitle(productInfo.get("title").toString().replace("\"", ""));

            String criticalInfo = ((List<Object>) (productInfo.get("newProGroup"))).get(1).toString();
            Map<String, Object> criticalInfoMap = JsonToMap.toMap(criticalInfo);
            Map<String, String> usefulMap = new HashMap<String, String>();
            for(Map.Entry<String, Object> entry : criticalInfoMap.entrySet()) {
                if(entry.getKey().toString().equals("attrs")) {
                    List<Object> infoList = (List<Object>)entry.getValue();
                    String key = "";
                    String value = "";
                    for(Object attr : infoList) {
                        Map<String, Object> obj = (Map<String, Object>)attr;
                        for(Map.Entry<String, Object> item : obj.entrySet()) {
                            if(item.getKey().equals("name")) {
                                key = item.getValue().toString().replace("\"", "");
                            } else {
                                value = item.getValue().toString().replace("\"", "");
                            }
                        }
                        usefulMap.put(key, value);
                    }
                }
            }
            System.out.println(usefulMap.toString());

            for(Map.Entry<String, String> entry : usefulMap.entrySet()) {
                if(entry.getKey().equals("货号")) {
                    product.setProductId(entry.getValue());
                } else if(entry.getKey().equals("上市年份季节")) {
                    product.setOnSaleTime(entry.getValue());
                } else if(entry.getKey().equals("销售渠道类型")) {
                    product.setSaleChannel(entry.getValue());
                } else if(entry.getKey().equals("品牌")) {
                    product.setBrand(entry.getValue());
                }
            }
            System.out.println(product.toString());

            if(jdbcTemplate != null){
                int updates = jdbcTemplate.update("insert into product(productId, title, brand, brandId, onSaleTime, saleChannel) values(?,?,?,?,?,?)", product.getProductId(), product.getTitle(), product.getBrand(), product.getBrandId(), product.getOnSaleTime(), product.getSaleChannel());
                if(updates == 1){
                    System.out.println("插入数据成功!");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void crawlUrlInDB() {
        List<String> urlList = jdbcTemplate.queryForList("SELECT itemLink FROM sale LIMIT 10;", String.class);
        for(String url : urlList) {
            crawlProductPage(url);
        }
    }

    public static void main(String[] args) {
            new ProductCrawler().crawlUrlInDB();
        }
}
