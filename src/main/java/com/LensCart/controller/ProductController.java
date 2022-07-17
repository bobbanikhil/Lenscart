package com.LensCart.controller;

import java.util.List;
import java.util.Optional;

import com.LensCart.entity.Product;
import com.LensCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }
    @GetMapping("/{pid}")
    public Optional<Product> getProduct(@PathVariable Integer pid)
    {
        return productService.getProductById(pid);
    }




}