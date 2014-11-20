package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Project;

public interface ProjectRepository {
	
	List<Project> findProjects() throws DataAccessException;
	
	void save(Project project) throws DataAccessException;

}
