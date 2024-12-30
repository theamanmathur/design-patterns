package com.jdp.observer;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Subscriber implements Observer {

	@Getter
	String name;

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void notified(String message) {
		log.info("Notification from YoutubeChannel for {}: {}", name, message);

	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
