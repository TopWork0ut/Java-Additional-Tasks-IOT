package com.lviv.lpnu.iot2;

public class Teacher extends Staff{

	
	public Teacher(String nameString) {
		super(nameString);
		// TODO Auto-generated constructor stub
	}

	public String print(){
		return "I am a " + nameString;
	}

	@Override
	public void salary() {
		System.out.println("My salary is 800$");
	}
}
