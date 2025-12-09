package encapsulation;

public class JavaSessions {
	
	
	private int ssn;
	private String employeeName;
	private int empAge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaSessions JavaSessions = new JavaSessions();
		JavaSessions.setSsn(123123);
		JavaSessions.setEmpAge(30);
		JavaSessions.setEmployeeName("Yash");
		
		
		System.out.println("Employee Name is :" +JavaSessions.employeeName );
		System.out.println("Employee age is :" +JavaSessions.empAge );
		System.out.println("Employee setSsn is :" +JavaSessions.ssn );
	}
	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
