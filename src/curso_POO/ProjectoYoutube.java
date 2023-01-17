package curso_POO;

public class ProjectoYoutube {

	public static void main(String[] args) {
	
		Video v[] = new Video[3];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		System.out.println(v[0].toString());
		System.out.println("---------------------------");
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Lucas", 29, "masc", "lucas_julio");
		g[1] = new Gafanhoto("Maria", 25, "fem", "holy_mary");
		
		System.out.println(g[0].toString());
		System.out.println("---------------------------");
		Visualizacao vz = new Visualizacao(g[0],v[2]);
		System.out.println(vz.toString());
		
	}
	
}
