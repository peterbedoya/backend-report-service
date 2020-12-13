package com.apps.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "service_report")
public class ServiceReport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_report_id")	
	private Integer serviceReportId;
	
	@NotNull
	@Column(name = "technical_id", nullable = false)
	private String technicalId;
	
	@NotNull
	@Column(name = "service_id", nullable = false)
	private String serviceId;
	
	@NotNull
	@Column(name = "started_date", nullable = false)
	private Date startedDate;
	
	@NotNull
	@Column(name = "end_date", nullable = false)
	private Date endDate;

	public ServiceReport() {
	}

	public ServiceReport(String technicalId, String serviceId, Date startedDate, Date endDate) {
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

	@Override
	public String toString() {
		return "ServiceReport [endDate=" + endDate + ", serviceId=" + serviceId + ", serviceReportId=" + serviceReportId
				+ ", startedDate=" + startedDate + ", technicalId=" + technicalId + "]";
	}

}
