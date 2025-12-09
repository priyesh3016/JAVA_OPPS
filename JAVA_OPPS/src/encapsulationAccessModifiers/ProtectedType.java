package encapsulationAccessModifiers;
//Within the same package + subclasses (even in different packages).
class HR{
	public String name;
	protected String email;
}
public class ProtectedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR r1 = new HR();
		r1.name = "RapidHR";
		r1.email = "mail@gmail.com";
	}

}
