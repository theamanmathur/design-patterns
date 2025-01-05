package com.jdp.adapter;

public class IphoneChargerAdapter implements AndroidCharger {

	IphoneCharger iphoneCharger;

	public IphoneChargerAdapter(IphoneCharger iphoneCharger) {
		this.iphoneCharger = iphoneCharger;
	}

	@Override
	public void chargeAndroidPhone() {
		iphoneCharger.chargeIphone();
	}

}
