package Astrazione;

public class Veicolo_start {

	public static void main(String[] args) {
		Auto a1 = new Auto("500", 1940, "480cc");
		Bici b1 = new Bici("Bianchi", 1900, "Corsa");
		
		System.out.println(a1.muovi());
		System.out.println(b1.muovi());
		
		a1.frena();
		b1.frena();

	}

}
