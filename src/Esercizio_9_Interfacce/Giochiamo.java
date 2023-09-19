package Esercizio_9_Interfacce;

public class Giochiamo {

	public static void main(String[] args) {
		Eroe e = new Eroe("Ercole");
		Licantropo l = new Licantropo("Wolf", false);
		Licantropo lu = new Licantropo("Mario", true);
		Vampiro v = new Vampiro("Dracula");

		for(int i = 0; i<3; i++) {
			e.combatti();
		}
		
		v.azzanna();
		l.azzanna();
		lu.azzanna();
		
		System.out.println(v.getForza());
		System.out.println(l.getForza());
		System.out.println(lu.getForza());
		System.out.println(e.getForza());
		
	}

}
