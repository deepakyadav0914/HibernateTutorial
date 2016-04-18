package com.advanced.Hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="psp_result_testcases")
public class ResultTestCases{
	
	
	private String workflowid_fk;
	private String testcaseid;
	private String status;
	@Lob
	private String actual_response;
	private String actual_response_code;
	
	public String getWorkflowid_fk() {
		return workflowid_fk;
	}
	public void setWorkflowid_fk(String workflowid_fk) {
		this.workflowid_fk = workflowid_fk;
	}
	public String getTestcaseid() {
		return testcaseid;
	}
	public void setTestcaseid(String testcaseid) {
		this.testcaseid = testcaseid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActual_response() {
		return actual_response;
	}
	public void setActual_response(String actual_response) {
		this.actual_response = actual_response;
	}
	public String getActual_response_code() {
		return actual_response_code;
	}
	public void setActual_response_code(String actual_response_code) {
		this.actual_response_code = actual_response_code;
	}
}
