package curso_POO;

public class Caderno {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("Bic", "Azul", 0.5);
		c1.DesTampar();
		c1.setCarga(0);
		c1.Pintar();
		Caneta c2 = new Caneta("Bic", "Vermelha", 20);
		c2.DesTampar();
		c2.Pintar();
		c2.Status();

		/*
		 * Caneta c1 = new Caneta();
		 * 
		 * c1.carga = 10; c1.Modelo = "Bic"; c1.Cor = "Azul"; c1.Ponta = 0.5;
		 * c1.Rabiscar(); c1.Tampar(); c1.Rabiscar(); c1.Status(); c1.DesTampar();
		 * c1.Rabiscar(); c1.Pintar(); c1.Status();
		 */

		// contrutor simples
		/*
		 * Caneta c1 = new Caneta(); c1.setModelo("Bic"); c1.setPonta(0.5);
		 * System.out.println(c1.getModelo()); System.out.println(c1.getPonta());
		 * c1.Status();
		 */

		/// Caneta c1 = new Caneta("bic","azul",1.0);
		/*
		 * c1.Tampar(); c1.Status(); c1.DesTampar(); c1.Status();
		 */
		// c1.DesTampar();
		// System.out.println(c1.Tampada);
		// c1.Pintar();
		// System.out.println(c1.carga);
		// c1.setCarga(0);
		// c1.Rabiscar();
	}

}
