package curso_POO;

public class Caderno2 {
	public static void main(String[] args) {
		
		Caneta caneta = new Caneta(null, null, 0);
		caneta.Modelo = "Bic Cristal";
		caneta.Cor = "azul";
		caneta.setPonta(0.25);
		caneta.carga = 80;
		caneta.DesTampar();
		
		
		caneta.Status();
		caneta.Rabiscar();
	}
}
