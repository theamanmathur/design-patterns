package com.jdp.factory;

public class CoinFactory {

	public static Coin getCoin(CoinType coinType) {
		
//		if(type.equalsIgnoreCase("Copper")) {
//			return new CopperCoin();
//		}
//		else if(type.equalsIgnoreCase("Gold")) {
//			return new GoldCoin();
//		}
//		return null;
		
		return coinType.getConstructor().get();
	}
}
