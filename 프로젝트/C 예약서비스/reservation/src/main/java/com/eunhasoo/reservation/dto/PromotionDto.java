package com.eunhasoo.reservation.dto;

public class PromotionDto {

	private int id;
	private int productId;
	private String productImageUrl;

	public PromotionDto(int id, int productId, String productImageUrl) {
		this.id = id;
		this.productId = productId;
		this.productImageUrl = productImageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

}
