package com.rhadazezaibatsu.cursospringboot.entities;

import java.io.Serializable;

import com.rhadazezaibatsu.cursospringboot.entities.pk.OrderItemPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrdemItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPk id;
	private Integer quantity;
	private double price;
	
	public OrdemItem(Order order, Product product, Integer quantity, double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	
	public Order getOrder() {
		return id.getOrder();
	}

	public void SetOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void SetProduct(Product product) {
		id.setProduct(product);
	}
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
