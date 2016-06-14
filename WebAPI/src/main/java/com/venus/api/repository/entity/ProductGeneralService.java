package com.venus.api.repository.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
(name = "PRODUCT_GENERAL_SERVICE")
public class ProductGeneralService {

	@EmbeddedId
	GeneralServiceProductId productId;
	
	@EmbeddedId
	GeneralServiceProductId generalServiceId;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Embeddable
	public class GeneralServiceProductId implements Serializable {

		private static final long serialVersionUID = 1L;
		@Column(name="PRODUCT_ID")
		private long productId;
		@Column(name="GENERAL_SERVICE_ID")
		private String generalServiceId;

	}
	
	public GeneralServiceProductId getProductId() {
		return productId;
	}

	public void setProductId(GeneralServiceProductId productId) {
		this.productId = productId;
	}

	public GeneralServiceProductId getGeneralServiceId() {
		return generalServiceId;
	}

	public void setGeneralServiceId(GeneralServiceProductId generalServiceId) {
		this.generalServiceId = generalServiceId;
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
