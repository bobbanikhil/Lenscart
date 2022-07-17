package com.LensCart.service;

import com.LensCart.Repository.ProductRepository;
import com.LensCart.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.save(product);
    }
    public void updateProduct(Product product, int id){
        Optional<Product> optionalProduct= getProductById(id);
        Product myProduct=optionalProduct.get();
        if(myProduct!=null) {
            myProduct.setProductName(product.getProductName());
            myProduct.setPrize(product.getPrize());
        }
        productRepository.save(myProduct);
    }
    public void deleteProduct(int id)
    {
        productRepository.deleteById(id);
    }
    public ArrayList<Product> getAllProducts(){
        return new ArrayList<>(productRepository.findAll());
    }
    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }

}
