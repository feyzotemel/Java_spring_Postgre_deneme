package com.feyzo.feyzotemel.dataAccess.abstracts;

import com.feyzo.feyzotemel.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {


}
