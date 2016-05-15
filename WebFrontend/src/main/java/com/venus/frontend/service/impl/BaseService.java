package com.venus.frontend.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.venus.frontend.component.EnvComponent;

public abstract class BaseService {

	@Autowired
	protected RestTemplate restTemplate;
	
	@Autowired
	protected EnvComponent envComponent;
	
	
	protected List converMap(List<LinkedHashMap<String, Object>> src, Class dest) {
		
		List result = null;
		Object obj = null;
		
		try {
			
			if (src != null) {
				
				result = new ArrayList();
				Field[] destProp = dest.getDeclaredFields();
				
				for (LinkedHashMap<String, Object> map : src) {
					
					obj = dest.newInstance();
					for (Field property : destProp) {
						
						property.setAccessible(true);
						property.set(obj, map.get(property.getName()));
					}
				
					result.add(obj);
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
}
