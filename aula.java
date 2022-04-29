import java.util.Locale;
import java.util.Scanner;
public class aula {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		
		
	
		System.out.println("Entre com a quantidade de numeros que deseja armazenar: ");
		int recebe = leia.nextInt();
		
		int [] numeros = new int [recebe];
		
		for(int cont = 0; cont < numeros.length; cont++) {
			System.out.println("Entre com o " + cont + "º numero: ");
		numeros[cont] = leia.nextInt();
		} 
		
		for (int cont = 0; cont < numeros.length; cont++) {
			System.out.println("Numero no indice " +cont + ":" + numeros[cont]);
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
		
		int[][] numeros = new int [6][6];
	
		int incremento = 65;
		
		for(int i = 0; i < numeros.length; i++) {
		    for(int j = 0; j < numeros.length; j++) {
			   numeros [i][j] = incremento;
			   System.out.print(numeros[i][j] + "\t");
			   incremento++;	
		    }
		System.out.println();
		}
		
		System.out.println("Numeros na diagonal: ");
		for(int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i][i] + "\t");
		}
		leia.close();

	}

}
