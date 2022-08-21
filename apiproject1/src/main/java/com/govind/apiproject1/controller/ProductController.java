package com.govind.apiproject1.controller;

import com.govind.apiproject1.entity.Product;
import com.govind.apiproject1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products){
        return service.saveProduct(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){

        return service.getProducts();
    }

    @GetMapping("/productById/{p_id}")
    public Product findProductById(@PathVariable int p_id){
        return service.getProductById(p_id);
    }
    @GetMapping("/findProductByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @GetMapping("/findProductByType/{type}")
    public Product findProductByType(@PathVariable String type){
        return service.getProductByType(type);
    }
    @GetMapping("/findProductByCategory/{category}")
    public Product findProductByCategory(@PathVariable String category){
        return service.getProductByCategory(category);
    }
    @GetMapping("/findProductByPrice/{price}")
    public Product findProductByPrice(@PathVariable Double price){
        return service.getProductByPrice(price);
    }
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{p_id}")
    public String deleteProduct(@PathVariable int p_id){
        return service.deleteProduct(p_id);
    }

}
