package com.rcarrillocruz.android.openstackdroid.json.identity;

import java.util.List;

public class MetadataObject {
	private int is_admin;
	private List<String> roles;
	
	public MetadataObject() {
	}

	public int getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
