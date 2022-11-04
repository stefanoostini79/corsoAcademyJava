package lezione8Adecco;

/*
 * Dati 2 vettori che hanno la stessa dimensione
 *     (i vettori sono gia' inizializzati )
 *     
 *     controllare che la dimensione dei 2 vettori sia 
 *     uguale con if.
 *     
 *     creare un terzo array che ha la seguente forma :
 *     
 *     
 *     [    1  ,  4 ,  5 ]
 *    
 *     [    3 ,   1  , 5 ]
 *     
 *     
 *     [    4 , 5 , 10 ]
 *     Terzo vettore somma   
 */
public class Esercizio2 {

	public static void main(String[] args) {
		int vett1[] = { 3, 4, 5 };
		int vett2[] = { 4, 5, 6 };
		int vett3[] = { 0, 0, 0 };

		if (vett1.length == vett2.length)
			System.out.println("i vettori hanno la stessa dimensione");

		for (int index = 0; index < vett1.length; index++) {
			vett3[index] = vett1[index] + vett2[index];
			System.out.println("la somma nella pozizione " + (index + 1) 
					+ " è " + vett3[index]);
		}

	}
}
