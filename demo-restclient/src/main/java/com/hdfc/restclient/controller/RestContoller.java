package com.hdfc.restclient.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hdfc.restclient.proxy.CustomerProxy;
import com.hdfc.restclient.vo.Customer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/api/restclient")
@Produces(MediaType.APPLICATION_JSON)
public class RestContoller {
	
	@Inject
	@RestClient
	CustomerProxy proxy;
	
	@GET
	@Path("/get/{id}")
	public Response get(@PathParam("id") long id) {
		Customer cust = proxy.getCustomer(id);
		return Response.status(200).entity(cust).build();
	}
}
