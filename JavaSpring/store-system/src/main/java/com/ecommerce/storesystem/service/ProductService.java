package com.ecommerce.storesystem.service;

import org.springframework.stereotype.Service;

import com.ecommerce.storesystem.dto.ProductDto;
@Service
public interface ProductService {
	Object getAllProducts();
	Object getProduct(Long id);
	Object addProduct(ProductDto productDto);
	Object updateProduct(ProductDto productDto);
	Object deleteProduct(Long id);
}
