package com.tuan.exam.service;

import com.tuan.exam.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(int id);
    public void save(Product product);
    public void delete(Product product);
}
