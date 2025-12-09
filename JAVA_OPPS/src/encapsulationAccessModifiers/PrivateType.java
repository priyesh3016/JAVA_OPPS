package encapsulationAccessModifiers;


class Dev{
	private String password;
	
	//getter and  setters 
	

//Getter → A method used to read (get) the value of a private variable.
	public String getPassword() {
		return this.password;
		
	}
//Setter → A method used to update (set) the value of a private variable
	
	public void setPassword(String pass) {
		this.password = pass;
		
	}
}

 
public class PrivateType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dev d1 = new Dev();
		//d1.password = "abcde";	
		d1.setPassword("ABCD");
		System.out.println(d1.getPassword());
	
	}
}

