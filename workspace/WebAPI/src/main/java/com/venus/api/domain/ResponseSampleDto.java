package com.venus.api.domain;

public class ResponseSampleDto {

	private long sampleId;
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
	private String sampleName;
	private int sampleAge;
	
}
