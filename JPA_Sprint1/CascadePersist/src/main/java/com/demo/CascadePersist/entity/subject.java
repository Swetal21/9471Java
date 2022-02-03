package com.demo.CascadePersist.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class subject {
	
		@Id
		private int s_id;

		private String name;
		private int marks;
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public subject() {}
		public subject(int s_id, String name, int marks) {
			super();
			this.s_id = s_id;
			this.name = name;
			this.marks = marks;
		}
		

	}

