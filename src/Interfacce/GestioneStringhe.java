package Interfacce;

public interface GestioneStringhe {
	/*
	 * Da JAVA 11 in poi posso creare metodi finiti e proprietà inizializzate
	 */
	String es = "Sono es di Interface";
	
	default String pulisciStringa(String str) {
		str = str.trim();
		str = str.toLowerCase();
		return str;
	}

}
