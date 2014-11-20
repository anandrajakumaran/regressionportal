package org.springframework.samples.petclinic.web;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Project;
import org.springframework.samples.petclinic.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class ProjectController {

	private ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
		
	}
	
	
	 @RequestMapping("/projects")
	    public String showPrjectList(Map<String, Object> model) {
	        // Here we are returning an object of type 'Vets' rather than a collection of Vet objects 
	        // so it is simpler for Object-Xml mapping
		 	List<Project> project = this.projectService.findAllProjects();

	        model.put("project", project);
	        return "project/projectList";
	    }
	 
	    @RequestMapping(value = "/request", method = RequestMethod.GET)
	    public String initCreationForm(Map<String, Object> model) {
	        Project project = new Project();
	        
	        model.put("project", project);
	        return "project/createRequest";
	    }
	    
	    @RequestMapping(value = "/request", method = RequestMethod.POST)
	    public String addNewRequests(@Valid Project project, BindingResult result, SessionStatus status) {
			 

		            this.projectService.saveProject(project);;
		            //status.setComplete();
		            return "redirect:/request";
			
		    }

}
