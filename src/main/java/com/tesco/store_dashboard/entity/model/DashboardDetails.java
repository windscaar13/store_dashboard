package com.tesco.store_dashboard.entity.model;

import java.util.Date;
import java.util.List;

import com.tesco.store_dashboard.vo.DashboardDetailsInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DashboardDetails {
	
	@Id
	private long id;
	private long userId;
	private long userPreferenceId;
	private List<DashboardDetailsInfo> dashboardDetails;
	private Date createdDate;
	private Date updatedDate;
	private String updatedBy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getUserPreferenceId() {
		return userPreferenceId;
	}
	public void setUserPreferenceId(long userPreferenceId) {
		this.userPreferenceId = userPreferenceId;
	}
	public List<DashboardDetailsInfo> getDashboardDetails() {
		return dashboardDetails;
	}
	public void setDashboardDetails(List<DashboardDetailsInfo> dashboardDetails) {
		this.dashboardDetails = dashboardDetails;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
