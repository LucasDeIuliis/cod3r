package curso_POO;

public class Caneta {

	// Atributo

	public String Modelo;
	public String Cor;
	private double Ponta;
	protected int carga;
	protected boolean Tampada;
	

											// Métodos

	public void Status() {
		System.out.println("O modelo desta caneta é: " + this.Modelo);
		System.out.println("A cor desta caneta é: " + this.Cor);
		System.out.println("A carga desta caneta é: " + this.carga);
		System.out.println("A Caneta esta tampada ?: " + this.Tampada);
		System.out.println("A Ponta desta caneta é: " + this.Ponta);
	}

	public boolean Escrever() {
		return true;
	}

	public void Rabiscar() {
		if (this.Tampada == true) {
			System.out.println("Esta tampada");
		} else if (this.Tampada == false && this.carga > 0) {
			this.carga = (carga-1);
			System.out.println("Rabisco");
		} else if (this.carga <= 0){
			System.out.println("Está sem tinta mané");
		}
	}

	public void Pintar() {
		if (this.Tampada == true) {
			System.out.println("Esta tampada");
		} else if (this.Tampada == false && this.carga > 0) {
			this.carga = (carga-5);
			System.out.println("Fez uma bela pintura");
		} else if (this.carga <= 0){
			System.out.println("Está sem tinta mané");
		}
	}

	public void Tampar() {
		this.Tampada = true;

	}

	public void DesTampar() {
		this.Tampada = false;

	}
	
		
	
	/*public Caneta() {
		this.Tampar();
		this.Cor = "Azul";
	}*/
	

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public Caneta(String m, String c, double d) {
		this.Modelo = m;
		this.Cor = c;
		this.setPonta(d);
		this.Tampar();
		this.carga = 100;
	}
	
	public String getModelo() {
		return this.Modelo;
	}
	public void setModelo(String m) {
		this.Modelo = m;
	}
	public double getPonta() {
		return this.Ponta;
	}
	public void setPonta(double p) {
		this.Ponta = p;
	}
		
	}