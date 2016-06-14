package com.venus.api.repository.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
(name = "PRODUCT_IMAGE")
public class ProductImage {
	@EmbeddedId
	ImageIndProductId productId;
	
	@EmbeddedId
	ImageIndProductId imageIndex;
	
	@Column(name="IMAGE_PATH")
	private String imagePath;
	
	@Column(name="EXTENSION")
	private String extension;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	@Embeddable
	public class ImageIndProductId implements Serializable {

		private static final long serialVersionUID = 1L;
		@Column(name="PRODUCT_ID")
	    private long productId;
		@Column(name="IMAGE_INDEX")
	    private int imageIndex;

	}

	public ImageIndProductId getProductId() {
		return productId;
	}

	public void setProductId(ImageIndProductId productId) {
		this.productId = productId;
	}

	public ImageIndProductId getImageIndex() {
		return imageIndex;
	}

	public void setImageIndex(ImageIndProductId imageIndex) {
		this.imageIndex = imageIndex;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
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

