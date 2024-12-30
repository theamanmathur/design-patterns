package com.jdp.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

	public static void main(String[] args) {

		log.info("Factory Design Pattern");

//		Coin coin= CoinFactory.getCoin("COPPER");
		Coin coin = CoinFactory.getCoin(CoinType.COPPER);

		log.info(coin.getDescription());

//		coin = CoinFactory.getCoin("GOLD");
		coin = CoinFactory.getCoin(CoinType.GOLD);

		log.info(coin.getDescription());

	}

}
