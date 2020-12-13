package com.apps.service;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.apps.domain.ReportHours;
import com.apps.domain.ServiceReportRequest;
import com.apps.repository.ServiceReportRepository;
import com.apps.service.impl.CalculatorService;
import com.apps.util.ServiceReportObjectMother;


@SpringBootTest
@AutoConfigureMockMvc
class CalculatorServiceUnitTest {
    
	private static final Logger log = LogManager.getLogger(CalculatorService.class);
	
    @Autowired
    private CalculatorService calculatorService;

    @MockBean
    private ServiceReportRepository serviceReportRepository;

    @Test
    public void shouldCalculateHours() throws Exception {
    	ServiceReportRequest serviceReportRequest = ServiceReportObjectMother.buildServiceReportRequest();
    	ReportHours reportHoursToExpect= ServiceReportObjectMother.buildReportHoursToExpect();
    	
        when(serviceReportRepository.findbytechnicalIdAndWeekYear(serviceReportRequest.getTechnicalId(),serviceReportRequest.getWeekYear()))
        							.thenReturn(ServiceReportObjectMother.buildList());
        ReportHours reportHours= calculatorService.calculateHours(serviceReportRequest);
        
    	assertThat((reportHours.getTotalNormalHours())).isEqualTo(reportHoursToExpect.getTotalNormalHours());
    	assertThat((reportHours.getTotalNormalExtraHours())).isEqualTo(0.0);
    	assertThat((reportHours.getTotalSundayHours())).isEqualTo(reportHoursToExpect.getTotalSundayHours());
    	assertThat((reportHours.getTotalSundayExtraHours())).isEqualTo(0.0);
    	assertThat((reportHours.getTotalNightHours())).isEqualTo(reportHoursToExpect.getTotalNightHours());
    	assertThat((reportHours.getTotalNightExtraHours())).isEqualTo(0.0);
    }
    
    @Test
    public void shouldReturnZeroWhenNotExistReports() throws Exception {
    	ServiceReportRequest serviceReportRequest = ServiceReportObjectMother.buildServiceReportRequest();
    	
        when(serviceReportRepository.findbytechnicalIdAndWeekYear(serviceReportRequest.getTechnicalId(),serviceReportRequest.getWeekYear())).thenReturn(ServiceReportObjectMother.buildListEmty());
        ReportHours reportHours= calculatorService.calculateHours(serviceReportRequest);
        log.info(reportHours);
    	assertThat((reportHours.getTotalNormalHours())).isZero();
    	assertThat((reportHours.getTotalNormalExtraHours())).isZero();
    	assertThat((reportHours.getTotalSundayHours())).isZero();
    	assertThat((reportHours.getTotalSundayExtraHours())).isZero();
    	assertThat((reportHours.getTotalNightHours())).isZero();
    	assertThat((reportHours.getTotalNightExtraHours())).isZero();
    }



}
