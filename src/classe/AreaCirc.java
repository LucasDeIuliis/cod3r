package classe;

public class AreaCirc {
	
	
	
	double raio;
	static final double pi= 3.1415;

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
		
	}
	
	double area() {
		return raio * raio * pi; 
	}
}
