package lezione8Adecco;

import java.util.Random;

public class Operazioni {
	
	// input  2 numeri
	// output somma int
	
	public int somma(int num1,int num2) {
		
		int somma = num1+num2;
		return somma;
		}
	
	//input numero intero
	// output numero*2
	
	public int raddoppia(int numero) {
		return numero*2;
	}

	// input 2 interi
	// output numero più grande
	
	public int numeroMaggiore(int numero1,int numero2) {
		if(numero1<numero2)
			return numero1;
		else
			return numero2;
	}
	
	// input una stringa
	//output numero di caretteri di una stringa
	
	public int calcolaCaratteri(String paroString) {
		return paroString.length();
	}
	public int lancioDado() {
		Random lancio = new Random();
		int numeroGenerato = lancio.nextInt(6)+1;
		return numeroGenerato;
	}
	
	/**
	 * questa funzione prende in input prima una stringa e poi un numero di volte in
	 * cui ripetere la parola in un ciclo
	 * 
	 * @param parola
	 * @param numeroDiVolte
	 * @return  
	 */
	
	public String ripetiParola(String parola,int numeroDiVolte) {
		String ris ="";
		for(int i =0; i<numeroDiVolte;i++)
			ris+= parola;
		
		return ris;
	}
}
