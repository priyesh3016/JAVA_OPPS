package Constructor;

public class ParameterizedConstructor {
	
	int x,y;
	ParameterizedConstructor(int a , int b){
		x=a;
		y=b;
		
	}
	
	void sum(){
		{
			System.out.println(x+y);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor pc = new ParameterizedConstructor(100,200);
		pc.sum();
		
	}

}
