package Ereditariera;

import java.util.ArrayList;

public class Ereditarieta_start {

	public static void main(String[] args) {
		Persona p1 = new Persona("Michele", "Sorbo", 44, "Napoli", "081");
		Studente s1 = new Studente("Emidio", "Carleo", 17, "Vietri di Potenza", "081", "4A");
		Studente s2 = new Studente("Mirko", "Di Paolo", 16, "Sanremo","081", "3A");
		Segretario sg1 = new Segretario("Mario","Rossi", 45, "Milano","081", "15b");
		Docente d1 = new Docente("Giuseppe","Verdi", 54,"Roma","081","Latino");
		Docente d2 = new Docente("Paolo","Bruni", 48,"Roma","081","Matematica");
		
		StudentePrivato sp1 = new StudentePrivato("Mauro", "Bianchi", 22, "Milano","081", "5A", "Paritario Milano 2");
		
		//Creo array di studenti per avere la classe
		Studente[] classeA = new Studente[10]; //Array Classico di 10 elementi
		ArrayList<Studente> classeB = new ArrayList(); //ArrayList di studenti
		
		ArrayList<Docente> docenti = new ArrayList();
		
		ArrayList<Persona> classe_completa = new ArrayList();
		
		//Inserisco studneti in array 
		classeA[0] = s1;
		classeA[1] = s2;
		
		//ArrayList
		classeB.add(s1);
		classeB.add(s2);
		
		docenti.add(d1);
		docenti.add(d2);
		
		
		classe_completa.add(d1);
		classe_completa.add(s1);
		classe_completa.add(s2);
		//Stampare tutti gli studenti dell'array
		System.out.println(classeA.length);
		for(int i = 0; i < classeA.length; i++) {
			System.out.println(classeA[i]);
		}
		
		//Stampo tutti gli elementi dell'ArrayList
		System.out.println(classeB.size());
		
//		for(int i = 0; i < classeB.size(); i++) {
//			System.out.println(classeB.get(i));
//		}
		
		for(Studente el_s:classeB) {
			System.out.println(el_s);
		}
		
		for(Docente d:docenti) {
			System.out.println(d);
		}
		
		System.out.println("\n********************\n");
		
		for(Persona p:classe_completa) {
			System.out.println(p.saluta());
		}
		
		System.out.println(p1.getCognome());
		System.out.println(p1.saluta());
		
		//Studente
		System.out.println(s1.saluta());
		System.out.println(s1.getCognome());
		System.out.println(s1.getClasse());

		//Studente paritario
		System.out.println(sp1);
		System.out.println(sp1.presenta());
	}

}
