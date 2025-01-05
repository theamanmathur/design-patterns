package com.jdp.adapter;

public class AndroidPhone {

	AndroidCharger androidCharger;

	public AndroidPhone(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}
	
	void charge() {
		androidCharger.chargeAndroidPhone();
	}
	
}
