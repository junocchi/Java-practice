package com.fo.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
	private int orderNumber;
	private String customerName;
	private String state;
	private BigDecimal taxRate;
	private String productType;
	private BigDecimal area;
	private BigDecimal costPerSquareFoot;
	private BigDecimal laborCostperSquareFoot;
	private BigDecimal materialCost;
	private BigDecimal laborCost;
	private BigDecimal tax;
	private BigDecimal total;

	public Order(int orderNumber, String customerName, String state, BigDecimal taxRate, String productType,
			BigDecimal area, BigDecimal costPerSquareFoot, BigDecimal laborCostperSquareFoot, BigDecimal materialCost,
			BigDecimal laborCost, BigDecimal tax, BigDecimal total) {
		super();
		this.orderNumber = orderNumber;
		this.customerName = customerName;
		this.state = state;
		this.taxRate = taxRate;
		this.productType = productType;
		this.area = area;
		this.costPerSquareFoot = costPerSquareFoot;
		this.laborCostperSquareFoot = laborCostperSquareFoot;
		this.materialCost = materialCost;
		this.laborCost = laborCost;
		this.tax = tax;
		this.total = total;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public BigDecimal getLaborCost() {
		return laborCost;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
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

	public BigDecimal getLaborCostperSquareFoot() {
		return laborCostperSquareFoot;
	}

	public void setLaborCostperSquareFoot(BigDecimal laborCostperSquareFoot) {
		this.laborCostperSquareFoot = laborCostperSquareFoot;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public void setLaborCost(BigDecimal laborCost) {
		this.laborCost = laborCost;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [orderNumber = " + orderNumber + ", customerName = " + customerName + ", state = " + state
				+ ", taxRate = " + taxRate + ", productType = " + productType + ", area = " + area + " sq feet, costPerSquareFoot = "
				+ costPerSquareFoot + ", laborCostperSquareFoot = " + laborCostperSquareFoot + ", materialCost = "
				+ materialCost + ", laborCost = " + laborCost + ", tax = " + tax + ", total = " + total + "]";
	}
}
