package com.LensCart.service;

import com.LensCart.Repository.CategoryRepository;
import com.LensCart.Repository.ProductRepository;
import com.LensCart.entity.Category;
import com.LensCart.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;

    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
    public  void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }

    public void enrollCategory(int categoryId, int productId) {
        Category category= categoryRepository.findById(categoryId).get();
        Product product= productRepository.findById(productId).get();
        category.addProduct(product);
        categoryRepository.save(category);
    }
}
