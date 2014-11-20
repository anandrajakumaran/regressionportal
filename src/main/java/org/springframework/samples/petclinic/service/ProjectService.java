package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Project;

public interface ProjectService {
	
	
	public List<Project> findAllProjects() throws DataAccessException;
	
	void saveProject(Project project) throws DataAccessException;

}
