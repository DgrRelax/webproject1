package com.dgr.model;

public class Users {
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String telephone;
	
	private String email;
	
	private String datatime;
	
	private Integer out_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatatime() {
		return datatime;
	}

	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}

	public Integer getOut_id() {
		return out_id;
	}

	public void setOut_id(Integer out_id) {
		this.out_id = out_id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", telephone=" + telephone
				+ ", email=" + email + ", datatime=" + datatime + ", out_id=" + out_id + "]";
	}
}
