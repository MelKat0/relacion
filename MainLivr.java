package aula10;

public class MainLivr {

	public static void main(String[] args) {
		Livro livro = new Livro("Percy Jackson","Rick Riordan");
		
		System.out.println("O livro "+livro.getTitulo() +" é do autor "+livro.getAutor());

	}

}
