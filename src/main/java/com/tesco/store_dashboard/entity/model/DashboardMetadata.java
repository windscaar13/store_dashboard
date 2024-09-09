package com.tesco.store_dashboard.entity.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class DashboardMetadata {

	//@Id
	private long id;
	private List<String> storeDataType;
	private List<String> storeInfrastructureType;
	private List<String> availableStores;
	private List<Integer> alertsToBeDisplayed;
	private Date createdDate;
	private Date updatedDate;
	private String updatedBy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<String> getStoreDataType() {
		return storeDataType;
	}
	public void setStoreDataType(List<String> storeDataType) {
		this.storeDataType = storeDataType;
	}
	public List<String> getStoreInfrastructureType() {
		return storeInfrastructureType;
	}
	public void setStoreInfrastructureType(List<String> storeInfrastructureType) {
		this.storeInfrastructureType = storeInfrastructureType;
	}
	public List<String> getAvailableStores() {
		return availableStores;
	}
	public void setAvailableStores(List<String> availableStores) {
		this.availableStores = availableStores;
	}
	public List<Integer> getAlertsToBeDisplayed() {
		return alertsToBeDisplayed;
	}
	public void setAlertsToBeDisplayed(List<Integer> alertsToBeDisplayed) {
		this.alertsToBeDisplayed = alertsToBeDisplayed;
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
