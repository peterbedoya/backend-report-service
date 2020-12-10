package com.apps.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceReportRequest {
    
private Integer serviceReportId;

private String  technicalId;

private String  serviceId;

private String  startedDate;

private String  endDate;

public ServiceReportRequest() {
}

public Integer getServiceReportId() {
    return serviceReportId;
}

public void setServiceReportId(Integer serviceReportId) {
    this.serviceReportId = serviceReportId;
}

public String getTechnicalId() {
    return technicalId;
}

public void setTechnicalId(String technicalId) {
    this.technicalId = technicalId;
}

public String getServiceId() {
    return serviceId;
}

public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
}

public String getStartedDate() {
    return startedDate;
}

public void setStartedDate(String startedDate) {
    this.startedDate = startedDate;
}

public String getEndDate() {
    return endDate;
}

public void setEndDate(String endDate) {
    this.endDate = endDate;
}



}
