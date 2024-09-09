package com.tesco.store_dashboard.service.impl;

import java.util.List;

import com.tesco.store_dashboard.repo.DashboardDetailsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesco.store_dashboard.entity.model.DashboardDetails;
import com.tesco.store_dashboard.entity.model.DashboardMetadata;
import com.tesco.store_dashboard.entity.model.UserPreference;
import com.tesco.store_dashboard.service.StoreDashboardApplication;
import com.tesco.store_dashboard.vo.ResponseObject;

@Service
@Transactional
public class StoreDashboardApplicationImpl implements StoreDashboardApplication{

	@Autowired
	private DashboardDetailsRepo dashboardDetailsRepo;

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
		return dashboardDetailsRepo.findByUserId(Long.parseLong(userId));
	}

	@Override
	public ResponseObject updateDashboardDetails(DashboardDetails dashboardDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
