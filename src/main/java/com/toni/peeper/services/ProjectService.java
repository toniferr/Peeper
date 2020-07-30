package com.toni.peeper.services;

import java.util.List;

import com.toni.peeper.domain.Project;

public interface ProjectService {

	Project getProject(Integer id);

    List<Project> listProjects();   

}
