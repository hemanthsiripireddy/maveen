package org.hemanth.product.dao;

import org.hemanth.product.dto.Product;

public interface ProductDao {
    void create(Product product);
    Product read(int id);
    void delete(int id);
    void update(Product product);
}
