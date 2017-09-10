package com.example.bean;

public class ChineseImpl extends User implements Person {

	@Override
	public void Speak() {
		System.out.println("I'm Chinese,My name is "+this.getName()+",I'm "+this.getAge()+" years old!");
	}

}
