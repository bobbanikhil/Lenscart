package com.LensCart.controller;


import com.LensCart.entity.Product;
import com.LensCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    ProductService productService;

    @DeleteMapping("/{pid}")
    public void deleteProduct(@PathVariable Integer pid){
        productService.deleteProduct(pid);
    }
    @PutMapping("/{pid}")
    public void updateProduct(@RequestBody Product product, @PathVariable Integer pid) {
        productService.updateProduct(product,pid);
    }
    @PostMapping("/create")
    public void addProduct(@RequestBody Product product) {
        productService.createProduct(product);

    }
}
