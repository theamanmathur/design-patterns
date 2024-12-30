package com.jdp.abstractFactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Furniture {
	
	private Chair chair;
	private Table table;
	
	public enum FurnitureType {
	      VICTORIAN, MODERN;
	    }

	@Override
	public String toString() {
		return "Furniture [chair=" + chair.getDescription() + ", table=" + table.getDescription() + "]";
	}
	
	

}
