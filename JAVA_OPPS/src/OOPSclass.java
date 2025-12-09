


class pen {
	
	String Color;
	String Type;
	
	
	public void write() {
		System.out.println("Good Boy");
	}
	
	public void printColor() {
		System.out.println(this.Color);
	}
}

public class OOPSclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     pen  pen1 = new pen();
	     pen1.Color = "Blue";
	     pen1.Type = "Gel";
	     
	     pen  pen2 = new pen();
	     pen2.Color = "Black";
	     pen1.printColor();
	     pen2.printColor();
	     pen1.write();
	}

}
