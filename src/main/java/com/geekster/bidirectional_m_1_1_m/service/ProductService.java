package com.geekster.bidirectional_m_1_1_m.service;

import com.geekster.bidirectional_m_1_1_m.model.Product;
import com.geekster.bidirectional_m_1_1_m.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public String addProduct(Product newProduct) {
        productRepo.save(newProduct);
        return "added product";
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
