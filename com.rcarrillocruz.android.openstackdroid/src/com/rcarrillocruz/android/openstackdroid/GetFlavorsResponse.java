package com.rcarrillocruz.android.openstackdroid;

import java.util.List;

public class GetFlavorsResponse {
	private List<FlavorDetailsObject> flavors;

	public GetFlavorsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<FlavorDetailsObject> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<FlavorDetailsObject> flavors) {
		this.flavors = flavors;
	}
}
