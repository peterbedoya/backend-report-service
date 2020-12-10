package com.apps.controllers;

import com.apps.domain.ResponseDomain;
import com.apps.domain.ServiceReportRequest;
import com.apps.service.ICalculatorService;

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

    @PostMapping(value="/caculator-hours",produces = "application/json")
    public ResponseDomain calculateHours(@RequestBody ServiceReportRequest request) {

        return calculatorService.calculateHours();
    }
    

    @PostMapping(value="/report-hours",produces = "application/json")
    public ResponseDomain reportHours(@RequestBody ServiceReportRequest request) {
   
        return calculatorService.reportHours();
    }
     

}
