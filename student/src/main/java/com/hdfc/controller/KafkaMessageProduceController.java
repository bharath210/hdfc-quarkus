package com.hdfc.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/produce")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class KafkaMessageProduceController {
	
	@Inject
	MessageProducer producer;
	
	@POST
	public Response produce(String msg) {
		producer.produceMessage(msg);
		return Response.status(200).entity(msg).build();
	}

}
