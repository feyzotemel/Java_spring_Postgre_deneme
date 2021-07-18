package com.feyzo.feyzotemel.business.abstracts;

import com.feyzo.feyzotemel.entities.concretes.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
