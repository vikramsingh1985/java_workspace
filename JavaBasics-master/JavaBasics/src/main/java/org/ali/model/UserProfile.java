package org.ali.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.management.MXBean;

import lombok.Getter;
import lombok.Setter;

@MXBean @Getter @Setter
public class UserProfile {

	 private long id;
	    private String uuid;
	    private long orgId;
	    private String fullName;
	    private String email;
	    private String orgName;
	    private String phone;
	    private String gender;
	    private long birthYear;
	    private String country;
	    private String customInfo;
	    private Timestamp createdDate;

	    public UserProfile() {
	    }

	    public UserProfile(String fullName, String email, String orgName, String phone, String gender, long birthYear, String country ){

	        this.fullName = fullName;
	        this.email = email;
	        this.phone = phone;
	        this.gender = gender;
	        this.birthYear = birthYear;
	        this.country = country;
	        this.orgName = orgName;
	        this.createdDate = Timestamp.valueOf(LocalDateTime.now(ZoneId.of("Z")));
	    }
}
