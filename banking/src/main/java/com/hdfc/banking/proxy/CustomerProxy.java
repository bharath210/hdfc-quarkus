package com.hdfc.banking.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hdfc.banking.vo.CustomerVO;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/customer")
@RegisterRestClient
@Produces(MediaType.APPLICATION_JSON)
public interface CustomerProxy {
	
	@GET
	@Path("/{id}")
	public CustomerVO getCustomer(@PathParam("id") long id);

}
