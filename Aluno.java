package escola;

public class Aluno extends Pessoas{
	String turma;
	int nrChamada;
	
	
	public String imprimir() {
		return nome + " - " + cpf + " - " + endereco + " - " + rg + " - " + nrChamada;
	}

}
