package com.usa.nj.gov.service;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.usa.nj.gov.request.IndInfoRequest;
import com.usa.nj.gov.response.PlanInfoResponse;
@Service
public class EdServiceImpl implements EdService {
	
	@Override
	public PlanInfoResponse findEligibility(IndInfoRequest request) throws Exception {
		String plan=request.getPlan();
		Class clz=Class.forName("com.usa.nj.gov.service."+plan+"RuleService");
		Object obj=clz.newInstance();
		Method method=clz.getDeclaredMethod("executePlan",IndInfoRequest.class);
		PlanInfoResponse pir=(PlanInfoResponse) method.invoke(obj,request);		
		return pir;
	}

}
