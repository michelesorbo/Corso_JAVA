package Ereditariera;

public class StudentePrivato extends Studente {

	private String istituto;
	
	public StudentePrivato(String nome, String cognome, int eta, String residenza, String telefono, String classe, String istituto) {
		super(nome, cognome, eta, residenza, classe, telefono);
		this.istituto = istituto;
		
	}

	protected String getIstituto() {
		return istituto;
	}

	protected void setIstituto(String istituto) {
		this.istituto = istituto;
	}
	
	

}
