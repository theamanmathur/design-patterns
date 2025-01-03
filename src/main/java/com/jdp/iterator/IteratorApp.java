package com.jdp.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorApp {

	private static final TreasureChest TREASURE_CHEST = new TreasureChest();

	private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
		log.info("------------------------");
		log.info("Item Iterator for ItemType " + itemType + ": ");
		var itemIterator = TREASURE_CHEST.iterator(itemType);
		while (itemIterator.hasNext()) {
			log.info(itemIterator.next().toString());
		}
	}

	public static void main(String[] args) {
		demonstrateTreasureChestIteratorForType(ItemType.RING);
		demonstrateTreasureChestIteratorForType(ItemType.POTION);
		demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
		demonstrateTreasureChestIteratorForType(ItemType.ANY);

	}
}