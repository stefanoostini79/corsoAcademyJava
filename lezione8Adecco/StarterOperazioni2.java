package lezione8Adecco;

import java.util.Scanner;

public class StarterOperazioni2 {

	public static void main(String[] args) {

		Operazioni2 operation = new Operazioni2();
		
		Scanner tast = new Scanner(System.in);
		System.out.println("inserisci un numero e una parola");
		int numero = tast.nextInt();
		String parola = tast.next();
		
		System.out.println(operation.pari(numero)? true:false);
		
		System.out.println(operation.vocale(parola)? true:false);

		tast.close();
	}
}

