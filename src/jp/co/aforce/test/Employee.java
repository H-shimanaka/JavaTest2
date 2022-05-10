package jp.co.aforce.test;

public class Employee {

	//練習問題３
	private int number;
	private String name;
	private String gender;
	private int age;

	void setNumber(int number) {
		this.number = number;
	}

	void setName(String name) {
		this.name = name;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	void setAge(int age) {
		this.age = age;
	}


	int getNumber() {
		return this.number;
	}

	String getName() {
		return this.name;
	}

	String getGender() {
		return this.gender;
	}

	int getAge() {
		return this.age;
	}

}
