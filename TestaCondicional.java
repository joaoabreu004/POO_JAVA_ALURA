package sintaxeBasica;

public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 17; 
		int qtdPessoas = 1;
		
		if (idade >=  18) {
		  System.out.println("Voc� � maior de idade");
		} else {
			if(qtdPessoas >= 2) {
				System.out.println("Voc� n�o � maior de idade, "
						+ "mas est� acompanhado. Pode entrar!");
			} else {
			System.out.println("Voc� � menor de idade, "
					+ "e n�o est� acompanhado, N�o pode entrar!");
			}
		}	
	}
}
