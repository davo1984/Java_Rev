package com.David;

public final class ClassB extends ClassA{
	static String color = "BBBBB Class";
    
	  public final void someMethod(){
	    System.out.println("BBBBBBBBBB - Some method.");
	    System.out.println("color is " + color);
	    System.out.println("parent color is " + super.color);
	  }
	  

	  public final void someMethod(String s){
	    System.out.println("BBBBBBBBBB - " + s);
	    System.out.println("color is " + color);
	    System.out.println("parent color is " + super.color);
	  }
	  
	  
	}
