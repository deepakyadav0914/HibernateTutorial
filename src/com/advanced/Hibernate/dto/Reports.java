package com.advanced.Hibernate.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="psp_report_workflow")
public class Reports{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workflowid_fk")
	private int workflowid;
	private String build;
	private String workflowname;
	private String path;
	private String status;
	
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getWorkflowname() {
		return workflowname;
	}
	public void setWorkflowname(String workflowname) {
		this.workflowname = workflowname;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getWorkflowid() {
		return workflowid;
	}
	public void setWorkflowid(int workflowid) {
		this.workflowid = workflowid;
	}
	
	
	
}
