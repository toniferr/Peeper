package com.toni.peeper.repositories;

import org.springframework.data.repository.CrudRepository;

import com.toni.peeper.domain.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Integer>{

}
