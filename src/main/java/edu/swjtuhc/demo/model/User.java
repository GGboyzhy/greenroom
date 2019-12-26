package edu.swjtuhc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name="sysuser")
public class User {
	@JsonProperty(value = "id,username,userpassword")
	@Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String userpassword;

    public User(String username, String userpassword) {
        this.username = username;
        this.userpassword = userpassword;
    }

    public User() {
    }
    
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + "]";
	}

    
}
