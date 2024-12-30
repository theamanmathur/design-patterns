package com.jdp.abstractFactory;

import com.jdp.abstractFactory.Furniture.FurnitureType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FurnitureApp {

	public static void main(String[] args) {
		
		Furniture victorianFurniture = new Furniture();

		FurnitureFactory factory = FurnitureFactoryMaker.makeFactory(FurnitureType.VICTORIAN);
		
		victorianFurniture.setChair(factory.createChair());
		victorianFurniture.setTable(factory.createTable());
		
		log.info(victorianFurniture.toString());
		
		factory = FurnitureFactoryMaker.makeFactory(FurnitureType.MODERN);
		
		Furniture modernFurniture = new Furniture();
		
		modernFurniture.setChair(factory.createChair());
		modernFurniture.setTable(factory.createTable());
		
		log.info(modernFurniture.toString());
		
		
	}

}
