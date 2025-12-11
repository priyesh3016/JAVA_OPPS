package Polymorphism.Overriding;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static  polymarphism --compile-time  polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		
		
		System.out.println("*************");
		
		car c = new  car();
		c.start();
		c.stop();
		c.refuel();
		
		
		System.out.println("*&***************");

		car c1 = new  BMW();//child class object can be  referred bt parent class referance variable --dynamic plymorphism -runtime  polymorphism 
		c1.start();
		c1.stop();
		c1.refuel();
		
	}
}
