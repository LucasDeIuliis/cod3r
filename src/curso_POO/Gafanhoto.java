package curso_POO;

public class Gafanhoto extends Usuario {


	private String login;
	private int TotAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo,String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.TotAssistido = 0;
		// TODO Auto-generated constructor stub
	}

	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return TotAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		TotAssistido = totAssistido;
	}

	public void viuMaisUm() {
		
	}


	@Override
	public String toString() {
		return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", TotAssistido=" + TotAssistido + "]";
	}
	
	
	
	
	
}
