package com.example.springbootmall.dao;

import com.example.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
