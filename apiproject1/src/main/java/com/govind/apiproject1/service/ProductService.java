package com.govind.apiproject1.service;

import com.govind.apiproject1.entity.Product;
import com.govind.apiproject1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }
    public List<Product> saveProduct(List<Product> products) {
        return productRepository.saveAll(products);
    }
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public Product getProductById(int p_id){
        return productRepository.findById(p_id).orElse(null);
    }
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }
    public Product getProductByType(String type){
        return productRepository.findByType(type);
    }
    public Product getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }
    public Product getProductByPrice(Double price){
        return productRepository.findByPrice(price);
    }
    public String deleteProduct(int p_id){
        productRepository.deleteById(p_id);
        return "product removed !! "+ p_id;
    }
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getP_id()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setType(product.getType());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }
}
