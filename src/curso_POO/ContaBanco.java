package curso_POO;

public class ContaBanco {

	// Atributos
	public int numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// Metodos Personalizados

	public void estadoAtual() {
		System.out.println("---------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.saldo = (100);
		} else if (t == "cp") {
			this.saldo = (150);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, pois ainda existe Saldo!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, pois existe Débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar");
		}
	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.saldo >= v) {
				this.setSaldo(this.saldo - v);
				System.out.println("Saque realizado na conta " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel sacar!");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("impossível pagar");
		}
	}

	// Metodos Especiais

	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/*
	 * public void status() { if (this.tipo == "cc"){
	 * System.out.println("nome do Usuario:"+this.dono);
	 * System.out.println("Tipo da conta é: Conta Corrente");
	 * System.out.println("Seu status é:"+this.status);
	 * System.out.println("seus saldo é: R$"+this.saldo); }else if (this.tipo ==
	 * "cp"){ System.out.println("nome do Usuario:"+this.dono);
	 * System.out.println("Tipo da conta é: Conta Poupança");
	 * System.out.println("Seu status é:"+this.status);
	 * System.out.println("seus saldo é: R$"+this.saldo);
	 * 
	 * }
	 * 
	 * }
	 */

}
