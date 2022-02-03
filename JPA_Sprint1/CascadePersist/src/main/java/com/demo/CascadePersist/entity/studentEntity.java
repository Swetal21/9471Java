package com.demo.CascadePersist.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class studentEntity {
	
	
		@Id
		private int s_id;
		private String s_name;
		private int s_age;
		@OneToOne(cascade=CascadeType.PERSIST)
		private subject sub;
		
		public subject getSub() {
			return sub;
		}
		public void setSub(subject sub) {
			this.sub = sub;
		}
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getS_name() {
			return s_name;
		}
		public void setS_name(String s_name) {
			this.s_name = s_name;
		}
		public int getS_age() {
			return s_age;
		}
		public void setS_age(int s_age) {
			this.s_age = s_age;
		}public studentEntity(){}
		public studentEntity(int s_id, String s_name, int s_age) {
			super();
			this.s_id = s_id;
			this.s_name = s_name;
			this.s_age = s_age;
		}
		
		

	}
