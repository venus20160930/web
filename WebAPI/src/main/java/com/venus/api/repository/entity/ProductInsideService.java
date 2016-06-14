package com.venus.api.repository.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
(name = "PRODUCT_INSIDE_SERVICE")
public class ProductInsideService {

	@EmbeddedId
	InsideServiceProductId productId;
	
	@EmbeddedId
	InsideServiceProductId insideServiceId;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	@Embeddable
	public class InsideServiceProductId implements Serializable {

		private static final long serialVersionUID = 1L;
		@Column(name="PRODUCT_ID")
		private long productId;
		
		@Column(name="INSIDE_SERVICE_ID")
		private String insideServiceId;

	}
	
	public InsideServiceProductId getProductId() {
		return productId;
	}

	public void setProductId(InsideServiceProductId productId) {
		this.productId = productId;
	}

	public InsideServiceProductId getInsideServiceId() {
		return insideServiceId;
	}

	public void setInsideServiceId(InsideServiceProductId insideServiceId) {
		this.insideServiceId = insideServiceId;
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
