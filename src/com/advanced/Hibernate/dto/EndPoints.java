package com.advanced.Hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

		
	@Entity
	@Table(name="psp_endpoints")
	public class EndPoints{
		
		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String component;
		private String endpoint;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getComponent() {
			return component;
		}
		public void setComponent(String component) {
			this.component = component;
		}
		public String getEndpoint() {
			return endpoint;
		}
		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}
}
