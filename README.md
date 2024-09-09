Overview 
Generate key metrics information related to store operations in one GenAI Dashboard. This is helpful for store managers and colleagues to check product shortages, upcoming forecasted products, current shift colleagues, products nearing expiry, stocks unsold for long durations, network bandwidth speed, P1/P2 incident updates & ETA, MPC internet usage, and more.

UI Design
![image](https://github.com/user-attachments/assets/616798db-f7fd-4200-bf52-b1f0159574da)

Store Dashboard:
Store Filter: Store AI Dashboard has a Store filter with which the Store Colleagues should be able to filter from the different stores that they have access to.
Critical Alerts: Store Colleague should be able to see high critical alerts on the Business area they have selected. These highly critical alerts when further clicked will open a pop-up with more details on the alert. 
Info Cards: Based on Different categories (Store Data, Store Infrastructure etc.) the Information Cards will be displayed (sorted based on the most critically actionable events to the least). 

Customize Dashboard:
Store Colleagues will be able to select the Business Areas which they are interested in monitoring using the Customize section.

![image](https://github.com/user-attachments/assets/a05a6400-ef08-4527-8f39-7bd0cefc8b36)

API: getDashboardMetaInfo – Use this API to display drop down values in the Customize page
JSON Response Payload
![image](https://github.com/user-attachments/assets/a00b406e-9902-40b7-a872-8dd4682d9cef)

[
  {
    "id": 0,
    "storeDataType": [
      "string"
    ],
    "storeInfrastructureType": [
      "string"
    ],
    "availableStores": [
      "string"
    ],
    "alertsToBeDisplayed": [
      0
    ],
    "createdDate": "2024-08-12T11:45:40.118Z",
    "updatedDate": "2024-08-12T11:45:40.118Z",
    "updatedBy": "string"
  }
]

UI reference:
![image](https://github.com/user-attachments/assets/c8e6e594-823a-4f45-a312-955a71829d83)

API: updateDashboardDetails – Capture Dashboard customization details to an individual user (For demo we only have one user – DemoUser)
JSON Request Payload
{
  "id": 0,
  "userId": 0,
  "userPreferenceId": 0,
  "dashboardDetails": [
    {
      "storeId": "Store 01",
      "criticalAlerts": [
        {
          "alertData": [
            "title:XXXX;description:XXX",
			"title:XXXX;description:XXX"
          ]
        }
      ],
      "storeData": [
        {
          "storeEventData": [
            "title:XXXX;description:XXX",
			"title:XXXX;description:XXX"
          ]
        }
      ],
      "storeInfraData": [
        {
          "storeInfraEventData": [
            "title:XXXX;description:XXX",
			"title:XXXX;description:XXX"
          ]
        }
      ]
    }
  ],
  "createdDate": "2024-08-12T11:49:28.892Z",
  "updatedDate": "2024-08-12T11:49:28.892Z",
  "updatedBy": "string"
}
API: getDashboardDetails – Getting the Dashboard details for the main page render
Request param – userId
Response JSON Details:
Same as updateDashboardDetails.

More important JSON:

const Payload = {
    id: 0,
    userId: 0,
    userPreferenceId: 0,
    dashboardDetails: [
      {
        storeId: "Store 01",
        criticalAlerts: [
          {
            alertData: [
              { enabled: true, title: "Alert1", description: "test test test" },
              {
                enabled: true,
                title: "Alert2",
                description: "test test test",
              },
              { enabled: true, title: "Alert3", description: "test test test" },
            ],
          },
        ],
        storeData: [
          {
            storeEventData: [
              {
                enabled: true,
                title: "Products",
                totalProducts: 345,
                NearingExpiry: 42,
              },
              {
                enabled: true,
                title: "Orders",
                ordersPending: 12,
                ordersCancelled: 32,
              },
              {
                enabled: true,
                title: "Stock",
                unSoldStock: 16,
                lowStock: 46,
              },
            ],
          },
        ],
        storeInfraData: [
          {
            storeInfraEventData: [
              {
                enabled: true,
                title: "Wifi",
                bandWidthStength: "3.5 Ghz",
                lanBandWidth: "3.8 Ghz",
              },
              {
                enabled: true,
                title: "Tickets",
                pendingToResolve: 10,
                "p1/p2Count": 12,
              },
              {
                enabled: true,
                title: "Devices",
                activePDCU: 12,
                printersConnected: 32,
              },
            ],
          },
        ],
      },
    ],
    createdDate: "2024-08-12T11:49:28.892Z",
    updatedDate: "2024-08-12T11:49:28.892Z",
    updatedBy: "string",
  };

  const Payload2 = [
    {
      id: 0,
      userID: "Test",
      storeDataType: [
        {
          userType: "user",
          areas: ["Orders", "Products","Stock",],
        },
      ],
      storeInfrastructureType: ["Wifi", "Tickets", "Devices"],
      availableStores: ["store1", "store2", "store3"],
      alertsToBeDisplayed: [3],
      createdDate: "2024-08-12T11:45:40.118Z",
      updatedDate: "2024-08-12T11:45:40.118Z",
      updatedBy: "Test",
    },
  ];

DB Scripts:
 
SCHEMA NAME: sdash
 
CREATE TABLE sdash.user_details (
    user_id SERIAL PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL,
    user_designation VARCHAR(50),
    access_level VARCHAR(20),
    created_date DATE NOT NULL,
    updated_date DATE NOT NULL,
    updated_by VARCHAR(20) NOT NULL
);
 
CREATE TABLE sdash.user_preference (
	user_pref_id SERIAL PRIMARY KEY,
	user_id INT,
	user_pref_json JSON,
	critical_alerts_to_be_displayed INT,
	created_date DATE NOT NULL,
    updated_date DATE NOT NULL,
    updated_by VARCHAR(20) NOT NULL
);
 
CREATE TABLE sdash.dashboard_metadata (
	dashboard_meta_id SERIAL PRIMARY KEY,
	dashboard_meta_json JSON,
	created_date DATE NOT NULL,
    updated_date DATE NOT NULL,
    updated_by VARCHAR(20) NOT NULL
);	
 
CREATE TABLE sdash.dashboard_details (
	dashboard_id SERIAL PRIMARY KEY,
	user_id INT,
	user_pref_id INT,
	dashboard_json JSON,
	created_date DATE NOT NULL,
    updated_date DATE NOT NULL,
    updated_by VARCHAR(20) NOT NULL
);
  
Important links: https://innersource.soprasteria.com/




