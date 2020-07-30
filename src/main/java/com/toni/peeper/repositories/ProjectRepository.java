package com.toni.peeper.repositories;

import org.springframework.data.repository.CrudRepository;

import com.toni.peeper.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer>{

}
