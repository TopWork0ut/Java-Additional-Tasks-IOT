package com.lviv.lpnu.iot;

public class Dog implements Animal{

    @Override
    public String voice() {
	return "Bark!";
	
    }

    @Override
    public String feed(int number) {
	return "The dog" + (number + 1) + " is not hungry now";
	
    }

}
