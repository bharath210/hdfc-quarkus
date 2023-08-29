package com.hdfc.quarkus.controller;

import java.util.List;

import com.hdfc.quarkus.entity.EducationDetail;
import com.hdfc.quarkus.service.IEducationDetailService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/educationdetail")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EducationDetailController {
	
	@Inject
	IEducationDetailService educationDetailService;
	
	@POST
	public EducationDetail add(EducationDetail educationDetail) {
		return educationDetailService.addEducationDetails(educationDetail);
	}
	
	@GET
	@Path("/{id}")
	public EducationDetail getById(@PathParam("id") Long id) {
		return educationDetailService.getEducationDetailsById(id);
	}
	
	@GET
	@Path("/cust/{cid}")
	public List<EducationDetail> getByCustomerId(@PathParam("cid") Long cid) {
		return educationDetailService.fetchEducationDetailsByCustomerId(cid);
	}

}
