package com.advanced.Hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="psp_hostnames")
	public class HostNames{
		
		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String environment;
		private String host;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEnvironment() {
			return environment;
		}
		public void setEnvironment(String environment) {
			this.environment = environment;
		}
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
	}
