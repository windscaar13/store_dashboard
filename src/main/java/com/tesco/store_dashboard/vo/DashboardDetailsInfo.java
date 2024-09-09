package com.tesco.store_dashboard.vo;

import java.util.List;

public class DashboardDetailsInfo {
	
	private String storeId;
	private List<AlertEvents> criticalAlerts;
	private List<StoreDataEvents> storeData;
	private List<StoreInfrastructureEvents> storeInfraData;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<AlertEvents> getCriticalAlerts() {
		return criticalAlerts;
	}
	public void setCriticalAlerts(List<AlertEvents> criticalAlerts) {
		this.criticalAlerts = criticalAlerts;
	}
	public List<StoreDataEvents> getStoreData() {
		return storeData;
	}
	public void setStoreData(List<StoreDataEvents> storeData) {
		this.storeData = storeData;
	}
	public List<StoreInfrastructureEvents> getStoreInfraData() {
		return storeInfraData;
	}
	public void setStoreInfraData(List<StoreInfrastructureEvents> storeInfraData) {
		this.storeInfraData = storeInfraData;
	}

}
