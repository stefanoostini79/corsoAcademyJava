package lezione8Adecco;
/*
 * Esercizio 3 . 
 * 	  Dato un vettore già 
 *    inizializzato  { 4 , 8 , 12 }
 * 		
 *    e un numero in input con Scanner 
 *    
 *    determinare se il numero inserito
 *    e' presente all'interno del vettore
 *    
 */

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner tast = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int numero = tast.nextInt();
		int vett[] = { 5, 6, 7 };

		for (int index = 0; index < vett.length; index++) {
			if (numero == vett[index]) {
				System.out.println(numero + " è presente nel vettore");
		break;
			}
			
				
		}
		
		tast.close();
	}

}
