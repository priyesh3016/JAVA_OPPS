//Multilevel Inheritance – A class inherits another class, which is also inherited by another.

class D { 
	
	public  void  area() {
		System.out.println("displays area");
	}
}  
class E extends D{
	
	public  void  area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
class F extends  E { 
	 public  void  area(int r) {
			System.out.println((3.14)*r*r);
		}
}  

public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
