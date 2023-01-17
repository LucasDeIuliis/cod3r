package curso_POO;

public class ContaBanco {

	// Atributos
	public int numConta;
	protected String tipo;
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

	public void abrirConta(String conta) {
		this.setTipo(conta);
		this.setStatus(true);
		if (conta == "contaCorrente") {
			this.saldo = (100);
		} else if (conta == "contaPoupança") {
			this.saldo = (150);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0 || this.status == true) {
			System.out.println("Conta não pode ser fechada, pois ainda existe Saldo!");
		} else if (this.getSaldo() < 0 || this.status == true) {
			System.out.println("Conta não pode ser fechada, pois existe Débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(double valor) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar");
		}
	}

	public void sacar(double valor) {
		if (this.getStatus()) {
			if (this.saldo >= valor) {
				this.setSaldo(this.saldo - valor);
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
		if (this.getTipo() == "contaCorrente") {
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

}
