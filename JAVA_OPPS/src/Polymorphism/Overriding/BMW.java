package Polymorphism.Overriding;

public class BMW  extends car {//has-a realtionship

	
	//when some method  is  present in parent class as well as in child with the same name and same  number of  arguments.
	//is called Method-Overriding 
	public void start() {
		System.out.println("BMW-----start");
	}
	
	
	public  void theftSafety() {
		System.out.println("BMW-----theftSafety");
	}
}
