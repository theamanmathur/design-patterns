package com.jdp.factory;

import java.util.function.Supplier;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CoinType {

	COPPER(CopperCoin::new),
	GOLD(GoldCoin::new);

	private final Supplier<Coin> constructor;
}
