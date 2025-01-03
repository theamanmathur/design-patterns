package com.jdp.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Item {

	@Getter
	@Setter
	private ItemType type;
	private final String name;

	@Override
	public String toString() {
		return name;
	}
}


