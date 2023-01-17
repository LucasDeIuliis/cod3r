package curso_POO;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ContaBanco u1 = new ContaBanco();
	u1.setNumConta(01);
	u1.abrirConta("contaCorrente");
	u1.setDono("Jubileu");
	u1.depositar(300);
	u1.sacar(100);
	
	ContaBanco u2 = new ContaBanco();
	u2.setNumConta(02);
	u2.abrirConta("contaPoupança");
	u2.setDono("Creuza");
	u2.depositar(10);
	u2.sacar(180);
	
	ContaBanco u3 = new ContaBanco();
	u3.depositar(10);
	
	
	
	u1.estadoAtual();
	u2.estadoAtual();
	
	
	}

}
