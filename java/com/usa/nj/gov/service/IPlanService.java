package com.usa.nj.gov.service;

import com.usa.nj.gov.request.IndInfoRequest;
import com.usa.nj.gov.response.PlanInfoResponse;

public interface IPlanService {
	public PlanInfoResponse executePlan(IndInfoRequest request)throws Exception;
}
