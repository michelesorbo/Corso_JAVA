package Esercizio_7;

import java.text.ParseException;
import java.util.ArrayList;

public class ListaSpesa {

	public static void main(String[] args) throws ParseException {
		
		boolean tessera = true;
		double tot_spesa = 0;
		
		ArrayList<Prodotto> spesa = new ArrayList();
		
		
		Alimentari a1 = new Alimentari("A001", "Pane", 10, "19/09/2023");
		Alimentari a2 = new Alimentari("A002", "Latte", 10, "30/09/2023");
		NonAlimentari na1 = new NonAlimentari("NA01", "Acqua", 10, "legno");
		
		System.out.println(a1);
		System.out.println(na1.applicaSconto());
		
		System.out.println(a1.applicaSconto());
		System.out.println(a2.applicaSconto());
		
		spesa.add(a1);
		spesa.add(a2);
		spesa.add(na1);
		
		/*
		for(Prodotto p: spesa) {
			if(tessera) {
				tot_spesa += p.applicaSconto();
			}else {
				tot_spesa = p.getPrezzo();
			}
			
		}
		*/
		
		//Prima controllo se ha la tessera e poi clacolo il totale
		if(tessera) {
			for(Prodotto p:spesa) {
				tot_spesa += p.applicaSconto();
			}
		}else {
			for(Prodotto p:spesa) {
				tot_spesa += p.getPrezzo();
			}
			
		}
		
		System.out.println("Il totale da pagare è: " + tot_spesa);
	
		
		
		
		

	}

}
