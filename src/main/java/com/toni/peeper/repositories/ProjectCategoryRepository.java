package com.toni.peeper.repositories;

import org.springframework.data.repository.CrudRepository;

import com.toni.peeper.domain.Category;

public interface ProjectCategoryRepository extends CrudRepository<Category, Integer>{

}
