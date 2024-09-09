package com.tesco.store_dashboard.entity.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "dashboard_events")
public class DashboardEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventId")
    private long id;
    private long alertEventId;
    private long storeDataId;
    private long storeInfraDataId;
    private String storeId;
    private String status;
    private String eventDescription;
    private String title;
    private String type;
    private Date createdDate;
    private String updatedBy;

    public long getAlertEventId() {
        return alertEventId;
    }

    public void setAlertEventId(long alertEventId) {
        this.alertEventId = alertEventId;
    }

    public long getStoreDataId() {
        return storeDataId;
    }

    public void setStoreDataId(long storeDataId) {
        this.storeDataId = storeDataId;
    }

    public long getStoreInfraDataId() {
        return storeInfraDataId;
    }

    public void setStoreInfraDataId(long storeInfraDataId) {
        this.storeInfraDataId = storeInfraDataId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
