package com.rcarrillocruz.android.openstackdroid.operations.compute;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

import com.rcarrillocruz.android.openstackdroid.operations.ApiOperation;

import android.net.Uri;
import android.os.Bundle;

public class GetFlavorsOperation implements ApiOperation {
	private static final String urlTail = "/flavors/detail";
	
	public GetFlavorsOperation() {
		super();	
	}
	
	public HttpRequestBase invoke(Uri endpoint, String token, String tenantId,
			Bundle params) {
		HttpGet httpGet = new HttpGet(endpoint.toString() + urlTail);
		httpGet.setHeader("X-Auth-Token", token);

		return httpGet;
	}

}
