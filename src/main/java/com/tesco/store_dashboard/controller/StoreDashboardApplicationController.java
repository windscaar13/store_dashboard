package com.tesco.store_dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.store_dashboard.entity.model.DashboardDetails;
import com.tesco.store_dashboard.entity.model.DashboardMetadata;
import com.tesco.store_dashboard.entity.model.UserPreference;
import com.tesco.store_dashboard.service.StoreDashboardApplication;
import com.tesco.store_dashboard.vo.ResponseObject;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class StoreDashboardApplicationController {
	
	@Autowired
	private StoreDashboardApplication storeDashboardApplication;
	
	@GetMapping("getDashboardMetaInfo")
	public List<DashboardMetadata> getDashboardMetaInfo(){
		return storeDashboardApplication.getDashboardMetaInfo();
	}
	
	@GetMapping("getUserPreferenceInfo/{userId}")
	public UserPreference getUserPreferenceInfo(@PathVariable("userId") String userId){
		return storeDashboardApplication.getUserPreferenceInfo(userId);
	}
	
	@GetMapping("getDashboardDetails/{userId}")
	public DashboardDetails getDashboardDetails(@PathVariable("userId") String userId){
		return storeDashboardApplication.getDashboardDetails(userId);
	}
	
	@PutMapping("updateUserPreferenceInfo")
	public ResponseObject updateUserPreferenceInfo(@RequestBody UserPreference userPreference){
		return storeDashboardApplication.updateUserPreferenceInfo(userPreference);
	}	
	
	@PutMapping("updateDashboardDetails")
	public ResponseObject updateDashboardDetails(@RequestBody DashboardDetails dashboardDetails){
		return storeDashboardApplication.updateDashboardDetails(dashboardDetails);
	}

}
