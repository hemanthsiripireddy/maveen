package org.hemanth.product.bo;

import org.hemanth.product.dto.Product;

public interface ProductBo {

    void create(Product product);
    Product read(int id);
}
