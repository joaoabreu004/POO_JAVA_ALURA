package sintaxeBasica;

public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1275.50; 
		int valor = (int)salario;
		//O casting faz a convers�o quando ela n�o � 
		//poss�vel de forma autom�tica.
		System.out.println(valor); 
	}

}
