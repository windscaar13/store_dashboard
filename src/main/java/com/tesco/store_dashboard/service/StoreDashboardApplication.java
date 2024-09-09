package com.tesco.store_dashboard.service;

import java.util.List;

import com.tesco.store_dashboard.entity.model.DashboardDetails;
import com.tesco.store_dashboard.entity.model.DashboardMetadata;
import com.tesco.store_dashboard.entity.model.UserPreference;
import com.tesco.store_dashboard.vo.ResponseObject;

public interface StoreDashboardApplication {
	
	public List<DashboardMetadata> getDashboardMetaInfo();
	public UserPreference getUserPreferenceInfo(String userId);
	public ResponseObject updateUserPreferenceInfo(UserPreference userPreferenceList);
	public DashboardDetails getDashboardDetails(String userId);
	public ResponseObject updateDashboardDetails(DashboardDetails dashboardDetails);

}
