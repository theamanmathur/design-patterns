package com.jdp.builder;

public class User {

	private String name;
	private int age;
	private int salary;

	private User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.salary = builder.salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	static class Builder {

		private String name;
		private int age;
		private int salary;

		public Builder(String name) {
			this.name = name;
		}

		public static Builder UserBuilder(String name) {
			return new Builder(name);
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setSalary(int salary) {
			this.salary = salary;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}
}
