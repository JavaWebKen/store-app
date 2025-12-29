package com.javawebken.mystore.service;

import com.javawebken.mystore.dto.ProductDto;
import com.javawebken.mystore.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
