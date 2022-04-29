package sintaxeBasica;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 19; 
		int qtdPessoa = 1; 
		//boolean acompanhado = false; 
		boolean acompanhado; 
		
		if(qtdPessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
			
		
		if (idade >=  18 && acompanhado) {
		  System.out.println("Seja Bem-Vindo!");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
		
		System.out.println("Valor de acompanhado = " + acompanhado);
	}
}
