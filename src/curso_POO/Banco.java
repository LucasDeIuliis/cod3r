package curso_POO;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ContaBanco u1 = new ContaBanco();
	u1.setNumConta(01);
	u1.abrirConta("cc");
	u1.setDono("Jubileu");
	u1.depositar(300);
	
	ContaBanco u2 = new ContaBanco();
	u2.setNumConta(02);
	u2.abrirConta("cp");
	u2.setDono("Creuza");
	u2.depositar(0);
	
	
	
	
	u1.estadoAtual();
	u2.estadoAtual();
	
	
	}

}
