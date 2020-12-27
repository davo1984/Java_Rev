import java.util.ArrayList;

//Java Program to illustrate how to declare, instantiate, initialize  

//and traverse the Java array.  

class Testarray{  

	public static void main(String args[]){  
		
		int a[]=new int[5];  //declaration and instantiation  
		
		a[0]=10;  //initialization  
		
		a[1]=20;  
		
		a[2]=70;  
		
		a[3]=40;  
		
		a[4]=50;  
		
		//traversing array  
		
		for(int i=0;
				i<a.length;  //length is the property of array
				i++)  
		
		System.out.println("Value in array element "+i+" is "+a[i]);  
		
		//traversing array  
		System.out.println("\nAnd now backwards!\n");
		for(int i=a.length-1;
				i>=0;  //length is the property of array
				i--)  
		
		System.out.println("Value in array element "+i+" is "+a[i]);  
		
	}
	
	public static void makeArrayList(String args[]) {
		ArrayList<Integer> arrli = new ArrayList<Integer>();
	}
}  