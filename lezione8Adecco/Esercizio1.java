package lezione8Adecco;

import java.util.Scanner;

/*
 * Dato in ingresso un numero che deve!=0
 * controllare con un semaforo
 * 
 * vettore già inizializzato di double, motiplicarli per numero
 * e sostituirli nel vettore
 */
public class Esercizio1 {

	public static void main(String[] args) {
		Scanner tast = new Scanner(System.in);
		
		int numero;
		double vett[] = {3.4, 4.5, 5.5};
		
		do {
			System.out.println("Inserisci un numero diverso da 0");	
			numero = tast.nextInt();
			
		} while (numero==0);
			
		for(int index=0;index<vett.length;index++){
			vett[index]*= numero;
			System.out.println(vett[index]);	
		}
		
		
		tast.close();
		
	}

}
