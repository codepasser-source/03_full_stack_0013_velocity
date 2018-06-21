package com.mattdamon.model.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author MATTDAMON
 * 
 */
public class SysUserEntity implements Serializable {

	private static final long serialVersionUID = -3313935954166376513L;

	private String id;
	private String user_name;
	private String password;

	private List<SysRoleEntity> roles = new ArrayList<SysRoleEntity>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<SysRoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRoleEntity> roles) {
		if (roles == null) {
			return;
		}
		this.roles = roles;
	}

	public void addRole(SysRoleEntity role) {
		if (role == null) {
			return;
		}
		this.roles.add(role);
	}
}
