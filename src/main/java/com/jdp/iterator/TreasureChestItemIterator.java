package com.jdp.iterator;

public class TreasureChestItemIterator implements Iterator<Item> {

	private final TreasureChest chest;
	private int position;
	private final ItemType type;

	/**
	 * Constructor.
	 */
	public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
		this.chest = chest;
		this.type = type;
		this.position = -1;
	}

	@Override
	public boolean hasNext() {
		return findNextIdx() != -1;
	}

	@Override
	public Item next() {
		position = findNextIdx();
		if (position != -1) {
			return chest.getItems().get(position);
		}
		return null;
	}

	private int findNextIdx() {
		var items = chest.getItems();
		var tempIdx = position;
		while (true) {
			tempIdx++;
			if (tempIdx >= items.size()) {
				tempIdx = -1;
				break;
			}
			if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
				break;
			}
		}
		return tempIdx;
	}
}
