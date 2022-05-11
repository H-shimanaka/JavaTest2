package jp.co.aforce.test;

public class Employee {

	//練習問題３
	private int number;
	private String name;
	private String gender;
	private int age;

	void setDate(int number,String name,String gender,int age) {
		this.number = number;
		this.name = name;
		this.gender = gender;
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
