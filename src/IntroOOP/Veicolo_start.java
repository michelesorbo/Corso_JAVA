package IntroOOP;

public class Veicolo_start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veicolo v1 = new Veicolo("EG667CD","500","Emidio", 15000,0.30);
		Veicolo v2 = new Veicolo("FR004RE", "RAW4",25000,0.15);
		
		//Voglio stampare lo stato del veicolo
		
		System.out.println(v2.vediStato());
		System.out.println(v1.vediStato());
		System.out.println(v1.costoViaggio(15000));
		System.out.println(v2.costoViaggio(15000));
	}

}
