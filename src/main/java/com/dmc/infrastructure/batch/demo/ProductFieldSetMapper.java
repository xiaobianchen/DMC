package com.dmc.infrastructure.batch.demo;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * @author xiaobianchen
 * @version 1.0 2016/1/6
 * @link https://github.com/xiaobianchen/DMC
 * mapping an object refer to csv files
 */
public class ProductFieldSetMapper implements FieldSetMapper<Products> {

    @Override
    public Products mapFieldSet(FieldSet fieldSet) throws BindException {
        Products products = new Products();
        products.setId(fieldSet.readInt("id"));
        products.setName(fieldSet.readString("name"));
        products.setDescription(fieldSet.readString("description"));
        products.setQuantity(fieldSet.readInt("quantity"));

        return products;
    }
}
