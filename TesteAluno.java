package escola;

public class TesteAluno {
public static void main(String[] args) {
		
			Aluno a = new Aluno();
			a.nome = "diego";
			a.cpf = "765644";
			a.endereco = "rua cada espada";
			a.nrChamada = 50;
			a.rg = 8645676;
			
			
			ListaAlunos lista = new ListaAlunos();
			lista.adicionar(a);
			 
			System.out.println(lista.mostrar(0).imprimir());
	}	
}
