package dio.bootcamp;

import dio.bootcamp.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
				
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 8;
		System.out.println("Hello word! Nota " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}
