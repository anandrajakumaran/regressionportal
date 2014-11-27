package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

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
	  
	  @Column(name = "release_description")
	  private String release_description;
	  
	  @Column(name = "release_date")
	  @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	  @DateTimeFormat(pattern = "yyyy/MM/dd")
	  private DateTime release_date;
	  
	  @Column(name = "automation_required")
	  private String automation_required;
	  
	  @Column(name = "automation_status")
	  private String automation_status;
	  
	  @Column(name = "component")
	  private String component;
	  
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

	public String getRelease_description() {
		return release_description;
	}

	public void setRelease_description(String release_description) {
		this.release_description = release_description;
	}

	public DateTime getRelease_date() {
		return release_date;
	}

	public void setRelease_date(DateTime release_date) {
		this.release_date = release_date;
	}

	public String getAutomation_required() {
		return automation_required;
	}

	public void setAutomation_required(String automation_required) {
		this.automation_required = automation_required;
	}

	public String getAutomation_status() {
		return automation_status;
	}

	public void setAutomation_status(String automation_status) {
		this.automation_status = automation_status;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}
}
