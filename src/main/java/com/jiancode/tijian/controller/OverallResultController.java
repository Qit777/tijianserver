package com.jiancode.tijian.controller;

import com.jiancode.tijian.po.OverallResult;
import com.jiancode.tijian.service.OverallResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/overallResult")
public class OverallResultController {
	
	@Autowired
	private OverallResultService overallResultService;
	
	@RequestMapping("/listOverallResultByOrderId")
	public List<OverallResult> listOverallResultByOrderId(@RequestBody OverallResult overallResult) {
		return overallResultService.listOverallResultByOrderId(overallResult.getOrderId());
	}

}
