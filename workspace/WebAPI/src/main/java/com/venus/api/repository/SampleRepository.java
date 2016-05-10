package com.venus.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.venus.api.repository.entity.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long> {

	public Sample findBySampleId(String sampleId);
}
