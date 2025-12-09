


class demo  {
	
	String name;
	int  age ;
	
	
	public void printInfo(String name ) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}


}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.function  overloading - 1.Compile  time  polymorphism
		
		demo s1 = new demo();
		s1.name = "Ganesh";
		s1.age =  24;
		
		s1.printInfo(s1.name);
		s1.printInfo(s1.name, s1.age);
		
				
		
		
	}
	

}
