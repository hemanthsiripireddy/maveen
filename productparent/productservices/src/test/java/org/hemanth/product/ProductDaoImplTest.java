package org.hemanth.product;

import org.hemanth.product.dao.ProductDao;
import org.hemanth.product.dao.ProductDaoImpl;
import org.hemanth.product.dto.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductDaoImplTest {

    @Test
    void createProductShouldCreateAProduct(){

        Product product=new Product(1,"IPhone","good",500);
        ProductDao productDao=new ProductDaoImpl();
        productDao.create(product);
        Product rProduct=productDao.read(1);
        assertNotNull(rProduct);
        assertEquals("IPhone",rProduct.getName());


    }
}
