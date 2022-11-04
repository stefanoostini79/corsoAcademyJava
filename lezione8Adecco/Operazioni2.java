package lezione8Adecco;

/*
 1-Funzione
 *  Creare una funzione che prenda
 *  in input un numero e resituisca
 *  true o false se il numero e' pari
 *  restituisce true altrimenti false.
 */



public class Operazioni2 {

	public boolean pari(int numero) {
		if(numero%2==0) {
			return true; // return numero%2==0:
			
		}else
			return false;
	}
	
	/*
	 *  2-Funzione.
 *  Creare una funzione che prenda
 *  in input una Stringa e ritorna
 *  true se la stringa inizia
 *  con una vocale altrimenti false.
	 */
	
	public boolean vocale (String parola) {
		char carattere = parola.charAt(0);
		
		if(carattere == 'a'|| carattere=='e' || carattere == 'i'|| carattere =='o'
				|| carattere == 'u'){
			return true;	
		}else
			return false;
	}
}
