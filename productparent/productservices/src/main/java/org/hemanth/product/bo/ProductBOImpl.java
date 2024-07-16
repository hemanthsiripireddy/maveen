package org.hemanth.product.bo;

import org.hemanth.product.dao.ProductDao;
import org.hemanth.product.dao.ProductDaoImpl;
import org.hemanth.product.dto.Product;

public class ProductBOImpl implements  ProductBo{

    private  static ProductDao productDao= new ProductDaoImpl();
    @Override
    public void create(Product product) {

        productDao.create(product);

    }

    @Override
    public Product read(int id) {
        return productDao.read(id);
    }
}
