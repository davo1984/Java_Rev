package com.David;

public class Simulator {

	  public static void main(String[] args){
	    FinalClass fc = new FinalClass();
//	    fc.type = "New value";
		ClassA a = new ClassA();
	    fc.classA.greeting = "New Greeting";
	    ClassB b = new ClassB();
	    a.someMethod();
	    System.out.println("\n");
	    b.someMethod();
	    System.out.println("\n");
	    b.someMethod("a string");
	  }

}
