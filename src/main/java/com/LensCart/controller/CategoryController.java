package com.LensCart.controller;

import com.LensCart.entity.Category;
import com.LensCart.entity.Product;
import com.LensCart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAllCategory() {

        return categoryService.getAllCategory();

    }
    @PostMapping("/create")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.deleteCategory(id);
    }


}