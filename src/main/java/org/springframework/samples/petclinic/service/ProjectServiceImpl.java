package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Project;
import org.springframework.samples.petclinic.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	
    private ProjectRepository projectRepository;

	@Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
    
    @Override
    @Transactional(readOnly = true)
	public List<Project> findAllProjects() throws DataAccessException {
		// TODO Auto-generated method stub
		return projectRepository.findProjects();
	}

	@Override
	@Transactional
	public void saveProject(Project project) throws DataAccessException {
		projectRepository.save(project);
		// TODO Auto-generated method stub
		
	}

}
