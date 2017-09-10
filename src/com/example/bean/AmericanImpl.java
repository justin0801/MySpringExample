package com.example.bean;

public class AmericanImpl extends User implements Person {

	@Override
	public void Speak() {
		System.out.println("I'm American,My name is "+this.getName()+",I'm "+this.getAge()+" years old!");
	}

}
