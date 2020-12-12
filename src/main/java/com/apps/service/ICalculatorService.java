package com.apps.service;

import com.apps.domain.ReportHours;
import com.apps.domain.ServiceReportRequest;
import com.apps.models.ServiceReport;

public interface ICalculatorService {

	ReportHours calculateHours(ServiceReportRequest request);

	ServiceReport saveServiceReportHours(ServiceReportRequest request);
    
}
