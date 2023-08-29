package com.hdfc.restclient.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hdfc.restclient.vo.Customer;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
@Path("/api/customer")
public interface CustomerProxy {
	
	@GET
	@Path("/get/{id}")
	Customer getCustomer(@PathParam("id") long id);

}
