package com.tesco.store_dashboard.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tesco.store_dashboard.entity.model.DashboardDetails;
import com.tesco.store_dashboard.entity.model.DashboardMetadata;
import com.tesco.store_dashboard.entity.model.UserPreference;
import com.tesco.store_dashboard.service.StoreDashboardApplication;
import com.tesco.store_dashboard.vo.ResponseObject;

@Service
public class StoreDashboardApplicationImpl implements StoreDashboardApplication{
	
	

	@Override
	public List<DashboardMetadata> getDashboardMetaInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPreference getUserPreferenceInfo(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseObject updateUserPreferenceInfo(UserPreference userPreferenceList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DashboardDetails getDashboardDetails(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseObject updateDashboardDetails(DashboardDetails dashboardDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
