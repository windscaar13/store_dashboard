package com.tesco.store_dashboard.entity.model;

import java.util.Date;
import java.util.List;

import com.tesco.store_dashboard.vo.AreasToMonitor;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.tesco.store_dashboard.controller.converter.*;


@Entity
@Table(name = "user_preference")
public class UserPreference {
	
	@Id
	private long id;
	private long userId;
	private List<String> storeId;
	@Convert(converter = AreasToMonitorConverter.class)
    @Column(name = "areas_to_monitor", length = 500)
	private AreasToMonitor areasToMonitor;
	private int criticalAlertsToBeDisplayed;
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
	public List<String> getStoreId() {
		return storeId;
	}
	public void setStoreId(List<String> storeId) {
		this.storeId = storeId;
	}
	public AreasToMonitor getAreasToMonitor() {
		return areasToMonitor;
	}
	public void setAreasToMonitor(AreasToMonitor areasToMonitor) {
		this.areasToMonitor = areasToMonitor;
	}
	public int getCriticalAlertsToBeDisplayed() {
		return criticalAlertsToBeDisplayed;
	}
	public void setCriticalAlertsToBeDisplayed(int criticalAlertsToBeDisplayed) {
		this.criticalAlertsToBeDisplayed = criticalAlertsToBeDisplayed;
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
