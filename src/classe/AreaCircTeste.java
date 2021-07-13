package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc (5);
		//AreaCirc.pi = 5; uma forma de alteração depois de ter sido static (sem final)
		System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc (10);
		
		System.out.println(a2.area());
		
		
		AreaCirc a3 = new AreaCirc (15);
		
		System.out.println(a3.area());
		
		AreaCirc a4 = new AreaCirc (30);
		
		System.out.println(a4.area());
	}

}
