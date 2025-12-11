package Polymorphism.Overriding;

public class MethodOverloading {
	
	
	// Method Overloading:
	// When multiple methods have the SAME method name but DIFFERENT
	// number of parameters OR different types of parameters within the SAME class.


	    // ✔ Method 1: No input parameter
	    public void sum() {
	        System.out.println("SUM method → 0 input parameters");
	    }

	    // ✔ Method 2: One input parameter (double type)
	    public void sum(double d) {
	        System.out.println("SUM method → 1 input parameter (double)");
	        System.out.println("Value: " + d);
	    }

	    // ✔ Method 3: One input parameter (int type)
	    public void sum(int i) {
	        System.out.println("SUM method → 1 input parameter (int)");
	        System.out.println("Value: " + i);
	    }

	    // ✔ Method 4: Two input parameters (int type)
	    public void sum(int k, int l) {
	        System.out.println("SUM method → 2 input parameters (int, int)");
	        System.out.println("Sum: " + (k + l));
	    }

	

    public static void main(String[] args) {
    	MethodOverloading obj = new MethodOverloading();

        obj.sum();          // Calls 0-param method
        obj.sum(10.5);      // Calls double method
        obj.sum(5);         // Calls int method
        obj.sum(10, 20);    // Calls two-int method
    }

}
