package com.example.IMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_repair")
public class ItemRepair {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "repair_id")
	private long id;

	@Column(name = "repair_cost")
	private double cost;

	@Column(name = "item_price")
	private double price;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id_fk")
	private Item item;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendor_id_fk")
	private Vendor vendor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

}
