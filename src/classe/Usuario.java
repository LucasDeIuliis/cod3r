package classe;

import java.util.Objects;

public class Usuario {

	
	String nome;
	String email;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	
	
		/*if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		}
		else {
			return false;
		}*/
		
		/*Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome) ;
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		
		forma não muito segura */
		
		/*if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			return super.equals(objeto);
		}
		else {
			return false;
		} (codigo seguro usuario sempre sera do mesmo tipo) */
	
		
		}

