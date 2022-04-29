package sintaxeBasica;

public class DesafioFatorial {
	public static void main(String[] args) {
		int totalFatorial = 1; 
		
		for (int linha = 1; linha <= 10; linha++){
			System.out.print(linha +" ! = " ) ;
			for(int coluna = 1; coluna < linha; coluna++){
				System.out.print(coluna + " x ");
			}
			totalFatorial *= linha; 
			System.out.println(linha + " = " + totalFatorial);
			System.out.println();
		}
	}

}
