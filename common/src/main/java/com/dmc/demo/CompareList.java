package com.dmc.demo;

import java.util.*;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/16
 */
public class CompareList {

    /**
     * 比较两个list元素是否一样
     *
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static synchronized <T extends Comparable<T>> boolean compare(List<T> a, List<T> b) {
        if (a.size() != b.size())
            return false;
        Collections.sort(a);
        Collections.sort(b);
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i)))
                return false;
        }
        return true;
    }

    /**
     * 查找出两个list中不同的元素
     *
     * @param list1
     * @param list2
     * @return
     */
    public static List<String> getDiffElements(List<String> list1, List<String> list2) {
        Integer flag = 1;
        Map<String, Integer> map = new HashMap<String, Integer>(list1.size() + list2.size());
        List<String> diffList = new ArrayList<String>();
        for (String str1 : list1) {
            map.put(str1, flag);
        }

        for (String str2 : list2) {
            Integer key = map.get(str2);
            if (key != null) {
                map.put(str2, ++key);
                continue;
            } else {
                map.put(str2, flag);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == flag) {
                diffList.add(entry.getKey());
            }

        }

        return diffList;
    }


    //测试
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");

        list2.add("5");
        list2.add("2");
        list2.add("4");
        list2.add("3");

        boolean results = CompareList.compare(list1, list2);
        System.out.println(results);

        List<String> diffList = CompareList.getDiffElements(list1, list2);
        System.out.println("两个list中不同元素有:" + diffList);
    }
}
