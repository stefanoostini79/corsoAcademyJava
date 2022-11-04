package lezione8Adecco;
/* 
 *  creare una funzione che prenda
	 *  in input un numero intero
	 *  e ritorna il suo successivo.
	 *  
	 *  Es  10 ----> 11
	 *      12 ----->13
 * 
 */
public class Operazioni3 {

	public int numeroSuccesivo(int numero) {
		//numero =numero+1;
		return numero+1;
	}
	
	/*
	 * 2- Creare una funzione che prenda
	 * in input 2 parole e ritorna 
	 * la parola unita nel seguente modo:
	 * 
	 * 
	 * Es ( "ciao" , "miao") --------> "ciao miao"*/
	
	public String paroleUnite (String parola1,String parola2) {
		return parola1+=parola2;
	}
	
	/*
	 * 3- creare una funzione che prenda
	 * una stringa e ritorna la stringa
	 * al contrario.
	 */
	 public String parolaContrario(String parolaNormale) {
		 String parolaReverse ="";
		 int index = parolaNormale.length() - 1;

			while (index >= 0) {
				parolaReverse += parolaNormale.charAt(index);
				index--;
				
			}
			return parolaReverse;
	 }
}



