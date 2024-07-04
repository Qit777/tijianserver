package com.jiancode.tijian.controller;

import com.jiancode.tijian.po.CiReport;
import com.jiancode.tijian.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciReport")
public class CiReportController {

	@Autowired
	private CiReportService ciReportService;
	
	@RequestMapping("/listCiReport")
	public List<CiReport> listCiReport(@RequestBody CiReport ciReport) {
		return ciReportService.listCiReport(ciReport.getOrderId());
	}
}
