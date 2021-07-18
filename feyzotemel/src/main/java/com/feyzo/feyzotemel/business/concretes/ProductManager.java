package com.feyzo.feyzotemel.business.concretes;

import com.feyzo.feyzotemel.business.abstracts.ProductService;
import com.feyzo.feyzotemel.dataAccess.abstracts.ProductDao;
import com.feyzo.feyzotemel.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
