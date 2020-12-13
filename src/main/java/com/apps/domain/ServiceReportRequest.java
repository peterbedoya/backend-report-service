package com.apps.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceReportRequest {

	private Integer serviceReportId;

	private String technicalId;

	private String serviceId;

	private Date startedDate;

	private Date endDate;

	private Integer weekYear;

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

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getWeekYear() {
		return weekYear;
	}

	public void setWeekYear(Integer weekYear) {
		this.weekYear = weekYear;
	}

}
