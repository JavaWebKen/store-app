package com.javawebken.mystore.service;

import com.javawebken.mystore.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto> getProducts();
}
