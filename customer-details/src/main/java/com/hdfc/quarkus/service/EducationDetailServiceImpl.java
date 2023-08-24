package com.hdfc.quarkus.service;

import java.util.List;

import com.hdfc.quarkus.entity.EducationDetail;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EducationDetailServiceImpl implements IEducationDetailService {

	@Override
	@Transactional
	public EducationDetail addEducationDetails(EducationDetail educationDetail) {
		educationDetail.persist();
		return educationDetail;
	}

	@Override
	public EducationDetail getEducationDetailsById(long id) {
		return EducationDetail.findById(id);
	}

	@Override
	public List<EducationDetail> fetchEducationDetailsByCustomerId(long id) {
		return EducationDetail.list("customer.id", id);
	}

}
