package com.lviv.lpnu.iot2;

public class Student extends Person {
	private final String TYPE_PERSON = this.getClass().getSimpleName(); 
	
	public Student(String nameString) {
		super(nameString);
		System.out.println("Type of person: " + TYPE_PERSON);
	}
	
	
    @Override
    public String print() {
    	return "I am a " + nameString;
    }

}
