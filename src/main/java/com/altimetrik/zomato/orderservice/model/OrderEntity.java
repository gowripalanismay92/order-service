package com.altimetrik.zomato.orderservice.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
@Entity
@Table(name = "OrderEntity")
public class OrderEntity {

	@Id
	@Column(name="orderId")
	String orderId;

	@Column(name="restaurantId")
	private String restaurantId;
	
	
	@OneToMany
	@JoinColumn(name = "menuId", insertable=false, updatable= false,nullable = false, foreignKey = @ForeignKey(name = "ORDER_RESTAURANT_MENU_FK"))
	private Set<MenuItem> items;
	
	private double totalPrice;
	private long orderTime;
	private String specialNote;
	private long deliveryTime;
	private String note;

	//private String userId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	
	public Set<MenuItem> getItems() {
		return items;
	}

	public void setItems(Set<MenuItem> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public long getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(long orderTime) {
		this.orderTime = orderTime;
	}

	public String getSpecialNote() {
		return specialNote;
	}

	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}

	public long getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(long deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
	
}
