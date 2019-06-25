package com.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class UserVO {
	
	private Integer user;
	private String user_nm;
	private String user_passwd;
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}

	
	
	
}
