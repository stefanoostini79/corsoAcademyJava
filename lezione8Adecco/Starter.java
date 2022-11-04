package lezione8Adecco;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		/*Scanner tast = new Scanner(System.in);
		Persona persona1 = new Persona();

		System.out.println("inserisci il nome");
		persona1.nome = tast.next();

		System.out.println("età??");
		persona1.eta = tast.nextInt();

		System.out.println(persona1.nome);
		System.out.println(persona1.eta);
		tast.close();*/

		Cane cane =new Cane();
		int i=0;
		
		while(i<10) {
			cane.bark();
			i++;
		}
		

	}

}
