package com.tesco.store_dashboard.vo;

import java.util.List;


public class AreasToMonitor {
	
	private List<String> storeData;
	private List<String> storeInfrastructureData;
	
	public List<String> getStoreData() {
		return storeData;
	}
	public void setStoreData(List<String> storeData) {
		this.storeData = storeData;
	}
	public List<String> getStoreInfrastructureData() {
		return storeInfrastructureData;
	}
	public void setStoreInfrastructureData(List<String> storeInfrastructureData) {
		this.storeInfrastructureData = storeInfrastructureData;
	}
	
}
