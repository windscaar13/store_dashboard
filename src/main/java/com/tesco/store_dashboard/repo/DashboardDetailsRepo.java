package com.tesco.store_dashboard.repo;

import com.tesco.store_dashboard.entity.model.DashboardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DashboardDetailsRepo extends JpaRepository<DashboardDetails, Long> {

    public DashboardDetails findByUserId(long userId);

}
