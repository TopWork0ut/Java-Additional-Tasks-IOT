package com.lviv.lpnu.iot2;

public abstract class Staff extends Person{
//    private static final String TYPE_PERSON = "Staff";
    protected String TYPE_PERSON = this.getClass().getSimpleName(); 
    
    public Staff(String nameString) {
    	super(nameString);
    	System.out.println("Type of person: " + TYPE_PERSON);
    }
    			
	@Override
    public String print() {
    	return "I am a " + this.getClass().getSimpleName() ;
    }

    public abstract void salary();
 
    
}
