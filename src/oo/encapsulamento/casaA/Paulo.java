package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//System.out.println(esposa.segredo); //segredo é private então é incessivel , (apenas com get)
		System.out.println(esposa.facoDentroDeCasa); //visibilidade em pacote.
		System.out.println(esposa.formaDeFalar); // consegue pois é herança. 
		System.out.println(esposa.todosSabem); //public qualquer um pode ver
	}
}
