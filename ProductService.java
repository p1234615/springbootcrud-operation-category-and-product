package com.categorycrud.Category.projectservice;

import java.util.List;

import com.categorycrud.Category.projectModel.Product;

public interface ProductService {
	List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);

}
