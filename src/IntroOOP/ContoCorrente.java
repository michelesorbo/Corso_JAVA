package IntroOOP;

public class ContoCorrente {
	
	private double saldo;
	private String proprietario;
	static int numeroCCAperti = 0; //Static sono variabili comuni a tutte le istanze della classe
	static int tasso = 12;
	
	
	public ContoCorrente(double saldo, String proprietario) {
		this.saldo = saldo;
		this.proprietario = proprietario;
		numeroCCAperti++;
	}


	@Override
	public String toString() {
		return "ContoCorrente [saldo=" + saldo + ", proprietario=" + proprietario + "]";
	}


	protected double getSaldo() {
		return saldo;
	}


	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	protected String getProprietario() {
		return proprietario;
	}


	protected void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	protected static int getNumeroCCAperti() {
		return numeroCCAperti;
	}


	protected static void setNumeroCCAperti(int numeroCCAperti) {
		ContoCorrente.numeroCCAperti = numeroCCAperti;
	}


	protected static int getTasso() {
		return tasso;
	}


	protected static void setTasso(int tasso) {
		ContoCorrente.tasso = tasso;
	}
	
	
	
	
	

}
