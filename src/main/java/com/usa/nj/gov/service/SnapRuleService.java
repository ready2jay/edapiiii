package com.usa.nj.gov.service;

import com.usa.nj.gov.request.IndInfoRequest;
import com.usa.nj.gov.response.PlanInfoResponse;

public class SnapRuleService implements IPlanService {

	@Override
	public PlanInfoResponse executePlan(IndInfoRequest request) throws Exception {
		PlanInfoResponse pir = new PlanInfoResponse();
		String check = null;
		if (request.getMonthlyIncome() > 10000) {
			check = "Not eligible for this plan.....";
			System.out.println("not Eligible");
			pir.setDenialReason("High mothly income");
		} else {
			check = "Eligible for this plan....";
			System.out.println("eligible...");
			pir.setPlanStatus("approved..");
		}
		return pir;
	}

}
