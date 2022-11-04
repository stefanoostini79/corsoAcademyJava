package lezione8Adecco;

public class StarterOperazioni {

	public static void main(String[] args) {

		Operazioni opr = new Operazioni();
		
		String ris =opr.ripetiParola("ciao", 3);
		
		System.out.println(ris);
		
		System.out.println("numero di char " + ris.length());
	}

}
