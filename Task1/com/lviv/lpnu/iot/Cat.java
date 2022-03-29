package com.lviv.lpnu.iot;

public class Cat implements Animal{

    @Override
    public String voice() {
	return "Meow!";
	
    }

    @Override
    public String feed(int number) {
	return "The cat" + (number + 1) + " is not hungry now";
    }
    
}
