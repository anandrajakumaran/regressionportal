package org.springframework.samples.petclinic.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Project;
import org.springframework.samples.petclinic.repository.ProjectRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository{

    @PersistenceContext
    private EntityManager em;
    
	@Override
	@SuppressWarnings("unchecked")
	public List<Project> findProjects() throws DataAccessException {
		
		Query query = this.em.createQuery("SELECT submitter FROM Project submitter");
		 
		return query.getResultList();
		
	}

	@Override
	public void save(Project project) throws DataAccessException {
		// TODO Auto-generated method stub
	  	if (project.getId() == null) {
    		this.em.persist(project);     		
    	}
    	else {
    		this.em.merge(project);    
    	}
		
	}

}
