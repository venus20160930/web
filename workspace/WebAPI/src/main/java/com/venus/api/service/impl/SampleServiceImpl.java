package com.venus.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venus.api.domain.RequestCreateSampleDto;
import com.venus.api.domain.ResponseSampleDto;
import com.venus.api.repository.SampleRepository;
import com.venus.api.repository.entity.Sample;
import com.venus.api.service.SampleService;

@Service
@Transactional
public class SampleServiceImpl extends BaseService implements SampleService {
	
	@Autowired
	private SampleRepository sampleRepository;

	public List<ResponseSampleDto> findAll() {
		// TODO Auto-generated method stub
		
		
		return (List<ResponseSampleDto>) convertComponent.toList(
				(List<Sample>) sampleRepository.findAll() , ResponseSampleDto.class);
		
	}

	public void save(RequestCreateSampleDto sample) {
		// TODO Auto-generated method stub
		
		
		Sample sampleObject = (Sample) convertComponent.toObject(
				sample, Sample.class);
		
		sampleRepository.save(sampleObject);
		
	}

	public boolean exist(Long sampleId) {
		// TODO Auto-generated method stub
		return sampleRepository.exists(sampleId);
	}

	public long delete(Long sampleId) {
		// TODO Auto-generated method stub
		long count = 0;
		if (exist(sampleId)) {
			
			sampleRepository.delete(sampleId);
			sampleRepository.delete(sampleId);
			count++;
		}
		
		return count;
	}

	public ResponseSampleDto findBySampleId(Long sampleId) {
		return (ResponseSampleDto) convertComponent.toObject(
				sampleRepository.findOne(sampleId), ResponseSampleDto.class); 
	}
	
}
