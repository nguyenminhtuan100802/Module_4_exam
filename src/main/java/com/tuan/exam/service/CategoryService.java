package com.tuan.exam.service;

import com.tuan.exam.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> findAll();
    public Category findById(int id);
    public void save(Category category);
    public void delete(Category category);
}
