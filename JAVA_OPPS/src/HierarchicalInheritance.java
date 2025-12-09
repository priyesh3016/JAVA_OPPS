


class G { 
	public  void  area() {
		System.out.println("displays area");
	}
}  
class H extends G {
	public  void  area(int l,int h) {
		System.out.println(l*h);
	}
}  
class I extends G {
		 public  void  area(int r) {
				System.out.println((3.14)*r*r);
			}
}  


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g1= new G();
		g1.area();
		
		H g2 = new H();
		g2.area(5, 25);
	}

}
