package com.fo.dto;

import java.math.BigDecimal;

public class Product {

	private String productType;
	private BigDecimal costPerSquareFoot;
	private BigDecimal laborCostPerSquareFoot;

	public Product(String productType, BigDecimal costPerSquareFoot, BigDecimal laborCostPerSquareFoot) {
		super();
		this.productType = productType;
		this.costPerSquareFoot = costPerSquareFoot;
		this.laborCostPerSquareFoot = laborCostPerSquareFoot;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getCostPerSquareFoot() {
		return costPerSquareFoot;
	}

	public void setCostPerSquareFoot(BigDecimal costPerSquareFoot) {
		this.costPerSquareFoot = costPerSquareFoot;
	}

	public BigDecimal getLaborCostPerSquareFoot() {
		return laborCostPerSquareFoot;
	}

	public void setLaborCostPerSquareFoot(BigDecimal laborCostPerSquareFoot) {
		this.laborCostPerSquareFoot = laborCostPerSquareFoot;
	}

	@Override
	public String toString() {
		return "Product [productType=" + productType + ", costPerSquareFoot=" + costPerSquareFoot
				+ ", laborCostPerSquareFoot=" + laborCostPerSquareFoot + "]";
	}

}
