package com.jdp.abstractFactory;

import com.jdp.abstractFactory.Furniture.FurnitureType;

public class FurnitureFactoryMaker {

	public static FurnitureFactory makeFactory(FurnitureType type) {
		return switch (type) {
		case VICTORIAN -> new VictorianFurnitureFactory();
		case MODERN -> new ModernFurnitureFactory();
		};
	}
}
