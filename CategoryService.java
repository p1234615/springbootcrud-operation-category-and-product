package com.categorycrud.Category.projectservice;

import java.util.List;

import com.categorycrud.Category.projectModel.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);

	

}
