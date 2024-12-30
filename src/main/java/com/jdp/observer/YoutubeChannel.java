package com.jdp.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class YoutubeChannel implements Subject {

	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer observer) {
		subscribers.add((Subscriber) observer);
		log.info("Subscribers Count: {}", subscribers.size());
		log.info(subscribers.toString());
	}

	@Override
	public void unsubscribe(String name) {
		subscribers = subscribers.stream().filter(subscriber -> !subscriber.getName().equalsIgnoreCase(name)).toList();
		log.info(subscribers.toString());
	}

	@Override
	public void notify(String message) {
		subscribers.forEach(subscriber -> subscriber.notified(message));

	}

}
