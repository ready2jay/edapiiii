package com.usa.nj.gov.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usa.nj.gov.request.IndInfoRequest;
import com.usa.nj.gov.response.PlanInfoResponse;
import com.usa.nj.gov.service.EdService;

@RestController
public class PlanServiceController {
	private static final Logger logger = LoggerFactory.getLogger(PlanServiceController.class);
	@Autowired
	private EdService service;

	@PostMapping(value = "/ed", consumes = { "application/xml", " application/json" }, produces = { "application/xml",
			" application/json" })

	public PlanInfoResponse getEligibility(@RequestBody IndInfoRequest request) throws Exception {
		PlanInfoResponse response = null;
		try {
			logger.debug("getEligibility method execution starts....");
			response = service.findEligibility(request);
			logger.debug("getEligibility method execution ends.....");
			logger.info("eligibility resultl displayed....");
		} // try
		catch (Exception e) {
			logger.error("something wents wrong....");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} // catch
		return response;
	}
}
