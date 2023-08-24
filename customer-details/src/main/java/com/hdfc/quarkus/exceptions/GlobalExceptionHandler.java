package com.hdfc.quarkus.exceptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GlobalExceptionHandler implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity("An error occured -> " + exception.getMessage()).build();
	}	
	

}
