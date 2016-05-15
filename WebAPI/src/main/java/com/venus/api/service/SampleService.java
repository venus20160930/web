package com.venus.api.service;

import java.util.List;

import com.venus.api.domain.RequestCreateSampleDto;
import com.venus.api.domain.ResponseSampleDto;


public interface SampleService {

	public List<ResponseSampleDto> findAll();
	
	public void save(RequestCreateSampleDto sample);
	
	public boolean exist(Long sampleId);
	
	public long delete(Long sampleId);
	
	public ResponseSampleDto findBySampleId(Long sampleId);
	
}
