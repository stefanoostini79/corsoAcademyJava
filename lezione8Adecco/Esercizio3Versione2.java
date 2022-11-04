package lezione8Adecco;

import java.util.Scanner;

/*
 *  Versione2 :
 *    
 *    la versione 2 parte da un vettore
 *    di stringhe {"mario" , "luigi" , "ciro" }
 *    
 *    e un nome in input ( Scanner )
 *    
 *    il programma stampa si se il nome 
 *    è presente del vettore 
 *    
 *    attenzione ( per le stringhe si usa equals ) 
 * 
 */
public class Esercizio3Versione2 {

	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		System.out.println("inserisci un nome");
		String nome = tast.nextLine();
		String vettNomi[] = { "ste", "sara", "ash" };

		for (int index = 0; index < vettNomi.length; index++) {
			if (nome.equals(vettNomi[index])) {
				System.out.println(nome + " è presente nel vettore");
				break;
			}

		}
		tast.close();
	}

}
