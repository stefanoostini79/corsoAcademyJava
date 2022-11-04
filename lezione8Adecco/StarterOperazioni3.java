package lezione8Adecco;

import java.util.Scanner;

public class StarterOperazioni3 {

	public static void main(String[] args) {
		Scanner tast = new Scanner (System.in);
		
		
			Operazioni3 calcoli = new Operazioni3();
			System.out.println("inserisci");	
			int numero = tast.nextInt();
			String parola1 = tast.nextLine();
			String parola2 = tast.nextLine();
			String parolaNormale =tast.nextLine();
			
			System.out.println(calcoli.numeroSuccesivo(numero));
			System.out.println(calcoli.paroleUnite(parola1,parola2));
			System.out.println(calcoli.parolaContrario(parolaNormale));
tast.close();
	}

}
