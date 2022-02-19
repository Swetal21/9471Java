package com.demo.crudex.entity;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@SuppressWarnings("unused")
@Entity
@Table(name = "Player")		
@NamedQuery(name="Player.findByFuzzyEmail", query="from Player p WHERE p.emailAddress like :email")
public class Player {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="handle", unique=true)
	@Basic private String loginName;
	
	@Basic private String emailAddress;
	
	@Basic private Boolean verified; 
	
	@Column(nullable=false)
	private String password;
	
	@Transient				// these column will not be visible in the table 
	private String encryptedPassword;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date lastAccessTime;
	
	@Temporal(TemporalType.DATE)
	@Column(updatable=false)
	private java.util.Calendar registrationDate;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public java.util.Date getLastAccessTime() {
		return lastAccessTime;
	}

	public void setLastAccessTime(java.util.Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public java.util.Calendar getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(java.util.Calendar registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", loginName=" + loginName + ", emailAddress=" + emailAddress + ", verified="
				+ verified + ", password=" + password + ", encryptedPassword=" + encryptedPassword + ", lastAccessTime="
				+ lastAccessTime + ", registrationDate=" + registrationDate + "]";
	}

	public Player() {}

	public Player(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

	public Player(String loginName, String emailAddress, String password) {
		super();
		this.loginName = loginName;
		this.emailAddress = emailAddress;
		this.password = password;
	}	
}
