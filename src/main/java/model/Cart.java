package model;

import java.util.Map;

public class Cart {
	String email;
	Map<Long, Integer> items;
	
	public Cart(String email, Map<Long, Integer> items) {
		this.email = email;
		this.items = items;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


	public Map<Long, Integer> getItems() {
		return items;
	}

	public void setItems(Map<Long, Integer> items) {
		this.items = items;
	}
}
