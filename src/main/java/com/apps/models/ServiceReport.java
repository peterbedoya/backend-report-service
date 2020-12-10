package com.apps.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_report")
public class ServiceReport {


@Id
@Column(name="service_report_id", nullable = false)
private Integer serviceReportId;
@Column(name="technical_id", nullable = false)
private String  technicalId;
@Column(name="service_id", nullable = false)
private String  serviceId;
@Column(name="started_date", nullable = false)
private String  startedDate;
@Column(name="end_date", nullable = false)
private String  endDate;

public ServiceReport() {
}


public ServiceReport(Integer serviceReportId, String technicalId, String serviceId, String startedDate,
        String endDate) {
    this.serviceReportId = serviceReportId;
    this.technicalId = technicalId;
    this.serviceId = serviceId;
    this.startedDate = startedDate;
    this.endDate = endDate;
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

@Override
public String toString() {
    return "ServiceReport [endDate=" + endDate + ", serviceId=" + serviceId + ", serviceReportId=" + serviceReportId
            + ", startedDate=" + startedDate + ", technicalId=" + technicalId + "]";
}

    
}

