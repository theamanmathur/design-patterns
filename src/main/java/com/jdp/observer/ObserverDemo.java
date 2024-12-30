package com.jdp.observer;

import java.util.Scanner;

public class ObserverDemo {

	public static void main(String[] args) {

		Subscriber Aman = new Subscriber("Aman");

		YoutubeChannel channel = new YoutubeChannel();

		channel.subscribe(Aman);

		channel.notify("Observer DP");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"Choose an option:\n" + "1. Subscribe\n" + "2. Unsubscribe\n" + "3. Upload Video\n" + "4. Exit");

			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {

			case 1:
				System.out.println("\nEnter Name:");
				channel.subscribe(new Subscriber(sc.nextLine()));
				break;
			case 2:
				System.out.println("\nEnter Name:");
				channel.unsubscribe(sc.nextLine());
				break;
			case 3:
				System.out.println("\nEnter Video Title:");
				channel.notify(sc.nextLine());
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("\nInvalid Choice");
			}
		}
	}

}
