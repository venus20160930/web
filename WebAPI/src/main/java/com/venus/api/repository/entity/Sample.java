package com.venus.api.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Sample {

	@Id
	@Column(name="sample_id")
	private long sampleId;
	
	@Column(name="sample_name")
	private String sampleName;
	
	@Column(name="sample_age")
	private int sampleAge;

	public long getSampleId() {
		return sampleId;
	}

	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public int getSampleAge() {
		return sampleAge;
	}

	public void setSampleAge(int sampleAge) {
		this.sampleAge = sampleAge;
	}
	
	
}
