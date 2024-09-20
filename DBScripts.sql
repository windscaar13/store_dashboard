INSERT INTO sdash.dashboard_details(
	dashboardid, userid, userpreferenceid, createddate, updateddate, updatedby)
	VALUES (1, 1, 1, '2017-03-13', '2017-03-13', 'demouser');
	
	
INSERT INTO sdash.dashboard_details_info(
	dashboardinfoid, dashboarddetailsid, storeid, createddate, updatedby)
	VALUES (1, 1, 2001, '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_details_info(
	dashboardinfoid, dashboarddetailsid, storeid, createddate, updatedby)
	VALUES (2, 1, 2002, '2024-09-14', 'demouser');
	
--Store 2001
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (1, 1, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om1 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om1', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (2, 1, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om3 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om3', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (3, 1, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om4 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om4', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (4, 1, 'Critical', 'Critical Alert: Battery percentage is below 5% for device D008', 'Device is about to get switched off, take action! - D008', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (5, 1, 'Critical', 'Critical Alert: Device - D010 is currently offline', 'Device offline - D010', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');	
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (6, 1, 'Moderate', 'Moderate Alert: Network signal quality is below average for connection - om2 and requires attention', 'Network Signal is below average - om2', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (7, 1, 'Moderate', 'Moderate Alert: Network signal quality is below average for connection - om5 and requires attention', 'Network Signal is below average - om5', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (8, 1, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D005', 'Battery percentage is low for device - D005', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (9, 1, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D007', 'Battery percentage is low for device - D007', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (10, 1, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D006', 'Battery percentage low for device - D006', 'STORE_INFRA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (11, 1, 'Moderate', 'Moderate Alert: Food Spoilage project assigned to Store Colleague staff is reaching the end date on 2024-09-20. Please take necessary action!', 'Project on Food Spoilage is nearing end date', 'STORE_DATA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (12, 1, 'Moderate', 'Moderate Alert: Inventory Audit project assigned to Store manager is reaching the end date on 2024-09-19. Please take necessary action!', 'Project Inventory Audit is nearing end date', 'STORE_DATA', '2001', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (13, 1, 'Moderate', 'Moderate Alert: Promotions project assigned to Store colleague is reaching the end date on 2024-09-19. Please take necessary action!', 'Project on Promotions is nearing end date', 'STORE_DATA', '2001', '2024-09-13', 'demouser');

--Store 2002
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (14, 2, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om1 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om1', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (15, 2, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om3 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om3', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (16, 2, 'Critical', 'Critical Alert: Network signal quality is poor for connection - om4 and needs immediate attention', 'Immediate attention required: Network Signal Extremely Low - om4', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (17, 2, 'Critical', 'Critical Alert: Battery percentage is below 5% for device D008', 'Device is about to get switched off, take action! - D008', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (18, 2, 'Critical', 'Critical Alert: Device - D010 is currently offline', 'Device offline - D010', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');	
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (19, 2, 'Moderate', 'Moderate Alert: Network signal quality is below average for connection - om2 and requires attention', 'Network Signal is below average - om2', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (20, 2, 'Moderate', 'Moderate Alert: Network signal quality is below average for connection - om5 and requires attention', 'Network Signal is below average - om5', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (21, 2, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D005', 'Battery percentage is low for device - D005', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (22, 2, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D007', 'Battery percentage is low for device - D007', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (23, 2, 'Moderate', 'Moderate Alert: Battery percentage is below 30% for device D006', 'Battery percentage low for device - D006', 'STORE_INFRA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (24, 2, 'Moderate', 'Moderate Alert: Food Spoilage project assigned to Store Colleague staff is reaching the end date on 2024-09-20. Please take necessary action!', 'Project on Food Spoilage is nearing end date', 'STORE_DATA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (25, 2, 'Moderate', 'Moderate Alert: Inventory Audit project assigned to Store manager is reaching the end date on 2024-09-19. Please take necessary action!', 'Project Inventory Audit is nearing end date', 'STORE_DATA', '2002', '2024-09-13', 'demouser');
INSERT INTO sdash.dashboard_events(
	eventid, dashboardinfoid, status, eventdescription, title, type, storeid, createddate, updatedby)
	VALUES (26, 2, 'Moderate', 'Moderate Alert: Promotions project assigned to Store colleague is reaching the end date on 2024-09-19. Please take necessary action!', 'Project on Promotions is nearing end date', 'STORE_DATA', '2002', '2024-09-13', 'demouser');

