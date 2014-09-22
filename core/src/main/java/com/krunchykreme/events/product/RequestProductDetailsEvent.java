package com.krunchykreme.events.product;

import com.krunchykreme.events.ReadEvent;

public class RequestProductDetailsEvent {
	private Integer key;

	public RequestProductDetailsEvent(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}
}
