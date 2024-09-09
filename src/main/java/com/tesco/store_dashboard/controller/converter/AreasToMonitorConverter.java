package com.tesco.store_dashboard.controller.converter;

import com.tesco.store_dashboard.vo.AreasToMonitor;

import jakarta.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AreasToMonitorConverter implements AttributeConverter<AreasToMonitor, String>{
	
	private static final ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(AreasToMonitor areasToMonitor) {
		try {
            return objectMapper.writeValueAsString(areasToMonitor);
        } catch (JsonProcessingException jpe) {
            //log.warn("Cannot convert Address into JSON");
            return null;
        }
	}

	@Override
	public AreasToMonitor convertToEntityAttribute(String value) {
		 try {
	            return objectMapper.readValue(value, AreasToMonitor.class);
	        } catch (JsonProcessingException e) {
	            //log.warn("Cannot convert JSON into Address");
	            return null;
	        }
	}



}
