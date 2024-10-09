package aula10;

public class MainUni {

	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("USP");
		Estudante estudante = new Estudante("João", universidade);
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());

	}

}
