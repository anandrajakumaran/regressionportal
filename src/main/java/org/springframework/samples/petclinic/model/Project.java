package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  
	  @Column(name = "submitter")
	  private String submitter;
	  
	  @Column(name = "jira_id")
	  private String jira_id;
	  
	  @Column(name = "sme_status")
	  private String sme_status;
	  
	  @Column(name = "regression_status")
	  private String regression_status;
	  
	  @Column(name = "automation_link")
	  private String automation_link;
	  
	  @Column(name = "fusion_link")
	  private String fusion_link;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubmitter() {
		return submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public String getJira_id() {
		return jira_id;
	}

	public void setJira_id(String jira_id) {
		this.jira_id = jira_id;
	}

	public String getSme_status() {
		return sme_status;
	}

	public void setSme_status(String sme_status) {
		this.sme_status = sme_status;
	}

	public String getRegression_status() {
		return regression_status;
	}

	public void setRegression_status(String regression_status) {
		this.regression_status = regression_status;
	}

	public String getAutomation_link() {
		return automation_link;
	}

	public void setAutomation_link(String automation_link) {
		this.automation_link = automation_link;
	}

	public String getFusion_link() {
		return fusion_link;
	}

	public void setFusion_link(String fusion_link) {
		this.fusion_link = fusion_link;
	}
}
