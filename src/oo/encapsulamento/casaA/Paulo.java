package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//segredo
		//facoDentroDeCasa
		//formaDeFalar
		//todosSabem
		//System.out.println(esposa.segredo); //segredo � private ent�o � incessivel , (apenas com get)
		System.out.println(esposa.facoDentroDeCasa); //visibilidade em pacote.
		System.out.println(esposa.formaDeFalar); // consegue pois � heran�a. 
		System.out.println(esposa.todosSabem); //public qualquer um pode ver
	}
}
