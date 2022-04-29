package sintaxeBasica;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0; 
		while(contador < 11){
			System.out.println(contador);
			//contador += 1;
			contador++; 
		}
		
		System.out.println(contador);
	}
}
