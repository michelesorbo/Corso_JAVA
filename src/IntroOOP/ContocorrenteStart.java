package IntroOOP;

public class ContocorrenteStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContoCorrente cc1 = new ContoCorrente(5000, "Alessio");
		ContoCorrente cc2 = new ContoCorrente(15000, "Emidio");
		ContoCorrente cc3 = new ContoCorrente(8000, "Alessio");
		
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		cc3.setTasso(25);
		System.out.println(cc1.tasso);
		System.out.println(cc2.tasso);
		System.out.println(cc1.getNumeroCCAperti());
		System.out.println(cc2.getNumeroCCAperti());
	}

}
