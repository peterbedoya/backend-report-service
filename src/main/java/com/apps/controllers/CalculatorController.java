package com.apps.controllers;

import com.apps.domain.ReportHours;
import com.apps.domain.ResponseDomain;
import com.apps.domain.ServiceReportRequest;
import com.apps.models.ServiceReport;
import com.apps.service.ICalculatorService;
import com.apps.util.CaculatorUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(exposedHeaders = "Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CalculatorController {

	@Autowired
	private ICalculatorService calculatorService;

	@PostMapping(value = "/report-hours", produces = "application/json")
	public ResponseDomain saveServiceReportHours(@RequestBody ServiceReportRequest request) {

		try {
			ServiceReport serviceReport = calculatorService.saveServiceReportHours(request);

			return CaculatorUtil.getObjectResponseDomain(false, "0", "", serviceReport);
		} catch (Exception e) {
			// TODO: handle exception
			return CaculatorUtil.getObjectResponseDomain(true, "100", e.getMessage(), null);
		}
	}

	@PostMapping(value = "/caculator-hours", produces = "application/json")
	public ResponseDomain calculateHours(@RequestBody ServiceReportRequest request) {
		try {
			ReportHours reportHours = calculatorService.calculateHours(request);
			return CaculatorUtil.getObjectResponseDomain(false, "0", "", reportHours);
		} catch (Exception e) {
			// TODO: handle exception
			return CaculatorUtil.getObjectResponseDomain(true, "100", e.getMessage(), new ReportHours());
		}
	}

}
