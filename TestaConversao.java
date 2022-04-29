package sintaxeBasica;

public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1275.50; 
		int valor = (int)salario;
		//O casting faz a conversão quando ela não é 
		//possível de forma automática.
		System.out.println(valor); 
	}

}
