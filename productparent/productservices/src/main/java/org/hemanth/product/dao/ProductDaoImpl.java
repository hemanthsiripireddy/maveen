package org.hemanth.product.dao;

import org.hemanth.product.dto.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao{

    private Map<Integer,Product> map=new HashMap<>();
    @Override
    public void create(Product product) {
        map.put(product.getId(),product);

    }

    @Override
    public Product read(int id) {
        return map.get(id);

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Product product) {

    }
}
