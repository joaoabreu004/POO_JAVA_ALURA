package sintaxeBasica;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 17; 
		int qtdPessoas = 1;
		
		if (idade >=  18) {
		  System.out.println("Você é maior de idade");
		} else {
			if(qtdPessoas >= 2) {
				System.out.println("Você não é maior de idade, "
						+ "mas está acompanhado. Pode entrar!");
			} else {
			System.out.println("Você é menor de idade, "
					+ "e não está acompanhado, Não pode entrar!");
			}
		}	
	}
}
