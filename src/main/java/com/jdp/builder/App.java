package com.jdp.builder;

public class App {

	public static void main(String[] args) {

		User aman = new User.Builder("Aman").setAge(26).setSalary(1300000).build();
		
		User akash = User.Builder.UserBuilder("Akash").setAge(27).setSalary(1400000).build();
		
		System.out.println(aman);
		System.out.println(akash);
	}
}
