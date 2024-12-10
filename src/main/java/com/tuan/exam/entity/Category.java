package com.tuan.exam.entity;

import jakarta.persistence.*;

import java.util.List;

public class Category {
    @Id
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
