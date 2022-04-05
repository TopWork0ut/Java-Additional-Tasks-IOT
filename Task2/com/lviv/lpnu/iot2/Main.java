package com.lviv.lpnu.iot2;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {   
    	Person[] arrayOfPersons = new Person[] {new Cleaner("Mark"), new Cleaner("Tom"), 
    		new Teacher("Mike"), new Teacher("Elizabeth"), new Student("Bob")};
    	

	
    
//    	Stream<Person> arrayStream =  Arrays.stream(arrayOfPersons);
    	Arrays.stream(arrayOfPersons).forEach(Person -> {
    		Person.print();
    	});
    	
    	Arrays.stream(arrayOfPersons).filter(Person -> (Person.getClass().getSimpleName().equals("Cleaner") 
    		|| Person.getClass().getSimpleName().equals("Teacher")))
    		.forEach(Person -> {
    			((Staff)Person).salary();
    	});
//    	Arrays.stream(arrayOfPersons).forEach()
    }

}
