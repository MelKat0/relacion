package aula10;

public class MainEmpr {

	public static void main(String[] args) {
			Departamento departamento = new Departamento("Marketing");
			Empresa empresa = new Empresa ("Microsoft", departamento);
			
			System.out.println("A empresa: "+empresa.getNome()+" precisa de funcionários no departamento de "+departamento.getNome());

		}
}
