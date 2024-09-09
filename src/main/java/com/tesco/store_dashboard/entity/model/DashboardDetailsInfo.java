package com.tesco.store_dashboard.entity.model;

import com.tesco.store_dashboard.entity.model.DashboardEvents;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dashboard_details_info")
public class DashboardDetailsInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dashboardInfoId")
	private long id;
	private long dashboardDetailsId;
	private String storeId;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn( name = "alertEventId", referencedColumnName = "dashboardInfoId")
	private List<DashboardEvents> criticalAlerts;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn( name = "storeDataId", referencedColumnName = "dashboardInfoId")
	private List<DashboardEvents> storeData;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn( name = "storeInfraDataId", referencedColumnName = "dashboardInfoId")
	private List<DashboardEvents> storeInfraData;
	private Date createdDate;
	private String updatedBy;

	public long getDashboardDetailsId() {
		return dashboardDetailsId;
	}

	public void setDashboardDetailsId(long dashboardDetailsId) {
		this.dashboardDetailsId = dashboardDetailsId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public List<DashboardEvents> getCriticalAlerts() {
		return criticalAlerts;
	}

	public void setCriticalAlerts(List<DashboardEvents> criticalAlerts) {
		this.criticalAlerts = criticalAlerts;
	}

	public List<DashboardEvents> getStoreData() {
		return storeData;
	}

	public void setStoreData(List<DashboardEvents> storeData) {
		this.storeData = storeData;
	}

	public List<DashboardEvents> getStoreInfraData() {
		return storeInfraData;
	}

	public void setStoreInfraData(List<DashboardEvents> storeInfraData) {
		this.storeInfraData = storeInfraData;
	}
}
