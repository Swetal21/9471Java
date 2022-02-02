package com.demo.collectionsListMapping.entity;
import java.util.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class employee {

	
	
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		private int e_id;
		private String e_name;
		@ElementCollection
		private List<Address> address=new ArrayList<>();
		public int getE_id() {
			return e_id;
		}
		public void setE_id(int e_id) {
			this.e_id = e_id;
		}
		public String getE_name() {
			return e_name;
		}
		public void setE_name(String e_name) {
			this.e_name = e_name;
		}
		public List<Address> getAddress() {
			return address;
		}
		public void setAddress(List<Address> address) {
			this.address = address;
		}
		
		

	}
