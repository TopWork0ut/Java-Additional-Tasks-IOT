package com.lviv.lpnu.iot2;

public abstract class Person {
	protected String nameString;

	abstract String print();

	public Person(String nameString) {
		super();
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Person [nameString=" + nameString + ", print()=" + print() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}
