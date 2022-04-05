package com.lviv.lpnu.iot2;

public class Cleaner extends Staff{
	
	
	public Cleaner(String nameString) {
		super(nameString);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String print(){
		return "I am a " + nameString;
	}

	@Override
	public void salary() {
		System.out.println("My salary is 600$ ");
	}
}
