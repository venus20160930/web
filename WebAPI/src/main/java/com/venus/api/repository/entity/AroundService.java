package com.venus.api.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
(name = "AROUND_SERVICE")
public class AroundService {

	@Id
	@Column(name="AROUND_SERVICE_ID")
	private String aroundServiceId;

	@Column(name="AROUND_SERVICE_NAME")
	private String aroundServiceNm;
	
	@Column(name="ORDER_KEY")
	private String orderKey;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	public String getAroundServiceId() {
		return aroundServiceId;
	}

	public void setAroundServiceId(String aroundServiceId) {
		this.aroundServiceId = aroundServiceId;
	}

	public String getAroundServiceNm() {
		return aroundServiceNm;
	}

	public void setAroundServiceNm(String aroundServiceNm) {
		this.aroundServiceNm = aroundServiceNm;
	}

	public String getOrderKey() {
		return orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastModifiedUserId() {
		return lastModifiedUserId;
	}

	public void setLastModifiedUserId(String lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
