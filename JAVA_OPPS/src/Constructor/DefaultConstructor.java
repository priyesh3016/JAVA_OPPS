package Constructor;

public class DefaultConstructor {

	int x, y;
	
	 DefaultConstructor(){
		 
		 x=10;
		 y=12;	
	}
	 void sum() {
		 System.out.println(x+y);
	 }
	 

	 public static void main(String[] args) {
		 DefaultConstructor cd=new DefaultConstructor();
		 cd.sum();
	
	 }
}