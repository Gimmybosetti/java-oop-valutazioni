package it.corso.valutazioni;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random casual = new Random();
		int idStudente, assenze;
		double mediaVoti;
		boolean promosso = false;
		String strDouble;
		CalcolaValutazione[] studente = new CalcolaValutazione[20];
		
		for(int i = 0; i < 20; i++) {
			idStudente = i + 1;
			assenze = casual.nextInt(100) + 1;
			mediaVoti = casual.nextDouble(5.0);
			studente[i] = new CalcolaValutazione(idStudente, assenze, mediaVoti);
			strDouble = String.format("%.2f", mediaVoti);
			promosso = studente[i].verificaPromozione(studente[i].assenze, studente[i].mediaVoti);
			if (promosso == true) {
				System.out.print("Lo studente " + idStudente + " con assenze al " + assenze + "% e media voti di " + strDouble);
				System.out.println(" è: promosso");
			}else {
				System.out.print("Lo studente " + idStudente + " con assenze al " + assenze + "% e media voti di " + strDouble);
				System.out.println(" è: bocciato");
			}
		}
	}

}
