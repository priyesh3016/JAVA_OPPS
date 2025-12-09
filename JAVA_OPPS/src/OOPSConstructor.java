




class Student {
	
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	
	Student(){
		System.out.println("Happy World");
	}
}

public class OOPSConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Jack";
		
	}

}
