package escola;

public class ListaAlunos {
	private Aluno[] vetor = new Aluno[100];
	private int posicaoVaga = 0;
	
	
	
	public void adicionar(Aluno valor) {
		vetor[posicaoVaga]= valor;
		posicaoVaga++;
	}
	
	
	public void alterar(Aluno valor, int posicao) {
	
		if (posicao < posicaoVaga) {
			vetor[posicao]= valor;
	}
	
	}
	
	public Aluno mostrar(int posicao) {
		return vetor[posicao];
	}
	
	
	public void excluir(int posicao) {
		
		for (int i = posicao; i < vetor.length-1; i++) {
			vetor[i] = vetor[i+1];
		}
		vetor[vetor.length] = null;
	}
	
	public int procurar(String valor) {
		
		for (int i = 0; i <posicaoVaga; i++) {
			if (vetor[i].equals(valor))
				return i;
			
		}
		
		return -1;
		
	}
}
