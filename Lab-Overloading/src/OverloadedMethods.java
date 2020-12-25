
public class OverloadedMethods {

	  public static void main(String[] args) {
	    //create instance here
	    OverloadedMethods om = new OverloadedMethods();
	    om.print();

	    om.print("second print method");

	    om.print("second", "third");
	    System.out.println(om.toString());
	    System.out.println(om.hashCode());
	    
	    String s = "Hello";
	    String s2 = new String("Hello");
	    if (s.equals(s2)) {
	    	System.out.println("R equals");
	    } else {
	    	System.out.println("NOT equals");
	    }
	    if (s == s2) {
	    	System.out.println("R ==");
	    } else {
	    	System.out.println("NOT ==");
	    }
	    
	  }

	  //overload methods here
	  public void print(){
	    System.out.println("original print method.");
	  }
	  
	  public void print(String str){
		  System.out.println(str);
	  }

	  public void print(String str, String str2){
	    System.out.println(str + " " + str2);
	  }
}
