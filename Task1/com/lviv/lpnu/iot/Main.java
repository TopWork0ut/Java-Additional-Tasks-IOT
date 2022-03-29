package com.lviv.lpnu.iot;


public class Main {

    public static void main(String[] args) {
	int countAnimals = 4;
	Animal[] animalsArray = new Animal[countAnimals] ;
	for(int i = 0; i < countAnimals; i++) {
	    if(i < countAnimals/2) {
		animalsArray[i] = new Cat() ;
	    }
	    else {
		animalsArray[i] = new Dog() ;
	    }
	}
	
	
	for(int i = 0; i < countAnimals; i++) {
	    System.out.println(animalsArray[i].voice());
	    System.out.println(animalsArray[i].feed(i));
	    
	}
	
	
	
	
    }

}
