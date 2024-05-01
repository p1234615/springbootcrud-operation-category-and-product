package com.categorycrud.Category.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.categorycrud.Category.projectModel.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
