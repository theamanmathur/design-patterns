package com.jdp.observer;

public interface Subject {

	void subscribe(Observer observer);
	
	void unsubscribe(String name);
	
	void notify(String message);
}
