package com.rcarrillocruz.android.openstackdroid;

import java.util.List;

public class FlavorObject {
	private String id;
	private List<FlavorLinkObject> links;
	
	public FlavorObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<FlavorLinkObject> getLinks() {
		return links;
	}

	public void setLinks(List<FlavorLinkObject> links) {
		this.links = links;
	}
}
