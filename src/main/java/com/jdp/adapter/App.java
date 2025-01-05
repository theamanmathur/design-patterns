package com.jdp.adapter;

public class App {

	public static void main(String[] args) {

		IphoneCharger iphoneCharger = new IphoneCharger();

		IphoneChargerAdapter chargingAdapter = new IphoneChargerAdapter(iphoneCharger);

		AndroidPhone androidPhone = new AndroidPhone(chargingAdapter);

		androidPhone.charge();

	}
}
