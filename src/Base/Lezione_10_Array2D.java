package Base;

public class Lezione_10_Array2D {
	
	public static void main(String[] args) {
		
		String[][] classi = {
				{"Michele","Mario","Paolo"},
				{"Alessio","Emidio","Vincenzo"},
				{"Davide","Mirko","Nicola"},
				{"Luca","Daniel","Ousama"}
		};
		
		//System.out.println(classi);
		
		System.out.println("Classe 0");
		System.out.println(classi[0][0]);
		System.out.println(classi[0][1]);
		System.out.println(classi[0][2]);
		
		System.out.println("Classe 1");
		System.out.println(classi[1][0]);
		System.out.println(classi[1][1]);
		System.out.println(classi[1][2]);
		
		System.out.println("Classe 2");
		System.out.println(classi[2][0]);
		System.out.println(classi[2][1]);
		System.out.println(classi[2][2]);
		
		System.out.println("Classe 3");
		System.out.println(classi[3][0]);
		System.out.println(classi[3][1]);
		System.out.println(classi[3][2]);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Classe: " + i);
			for(int y = 0; y < 3; y++) {
				//System.out.println("I = " + i + " Y = " + y);
				System.out.print(classi[i][y] + ", ");
			}
			System.out.println(" ");
		}
		
		//Metodo Alternativo con foreach
		for(String[] classe:classi) {
			System.out.println();
			for(String studente: classe) {
				System.out.print(studente + " ");
			}
		}
	}

}
