package com.apps.domain;

public class ReportHours {
	
	private double totalNormalHours;
	private double totalNormalExtraHours;
	private double totalSundayHours;
	private double totalSundayExtraHours;
	private double totalNightHours ;
	private double totalNightExtraHours;
	
	
	
	public ReportHours() {
		super();
		this.totalNormalHours = 0;
		this.totalNormalExtraHours = 0;
		this.totalSundayHours = 0;
		this.totalSundayExtraHours = 0;
		this.totalNightHours = 0;
		this.totalNightExtraHours = 0;
	}


	
	public double getTotalNormalHours() {
		return totalNormalHours;
	}
	public void setTotalNormalHours(double totalNormalHours) {
		this.totalNormalHours = totalNormalHours;
	}
	public double getTotalNormalExtraHours() {
		return totalNormalExtraHours;
	}
	public void setTotalNormalExtraHours(double totalNormalExtraHours) {
		this.totalNormalExtraHours = totalNormalExtraHours;
	}
	public double getTotalSundayHours() {
		return totalSundayHours;
	}
	public void setTotalSundayHours(double totalSundayHours) {
		this.totalSundayHours = totalSundayHours;
	}
	public double getTotalSundayExtraHours() {
		return totalSundayExtraHours;
	}
	public void setTotalSundayExtraHours(double totalSundayExtraHours) {
		this.totalSundayExtraHours = totalSundayExtraHours;
	}
	public double getTotalNightHours() {
		return totalNightHours;
	}
	public void setTotalNightHours(double totalNightHours) {
		this.totalNightHours = totalNightHours;
	}
	public double getTotalNightExtraHours() {
		return totalNightExtraHours;
	}
	public void setTotalNightExtraHours(double totalNightExtraHours) {
		this.totalNightExtraHours = totalNightExtraHours;
	}



	@Override
	public String toString() {
		return "ReportHours [totalNormalHours=" + totalNormalHours + ", totalNormalExtraHours=" + totalNormalExtraHours
				+ ", totalSundayHours=" + totalSundayHours + ", totalSundayExtraHours=" + totalSundayExtraHours
				+ ", totalNightHours=" + totalNightHours + ", totalNightExtraHours=" + totalNightExtraHours + "]";
	}
	
	

}

