package com.venus.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.venus.api.component.ConvertComponent;

public abstract class BaseService {

	
	@Autowired
	protected ConvertComponent convertComponent;
}
