package com.tenxperts.spring.jdbc.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long orderId;
	private String user;
	private List<LineItem> items = new ArrayList<LineItem>();

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void addItem(LineItem item) {
		items.add(item);
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

}
