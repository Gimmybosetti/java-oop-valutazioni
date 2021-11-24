package it.corso.valutazioni;

public class CalcolaValutazione {
	int idStudente, assenze;
	double mediaVoti;
	
	CalcolaValutazione (int idStudente, int assenze, double mediaVoti){
		this.idStudente = idStudente;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}
	
	CalcolaValutazione (){
		this.idStudente = 0;
		this.assenze = 0;
		this.mediaVoti = 0;
	}
	
	boolean verificaPromozione (int assenze, double mediaVoti) {
		
		boolean promosso = false;
		
		if (assenze < 25 && mediaVoti >= 2) {
			promosso = true;
			return promosso;
		}else if((assenze >= 25 && assenze <= 50) && mediaVoti > 2) {
			promosso = true;
			return promosso;
		}else {
			return promosso;
		}
	}
}
