package Ereditariera;

public class Docente extends Persona {
	
	private String materia;

	public Docente(String nome, String cognome, int eta, String residenza, String telefono, String materia) {
		super(nome, cognome, eta, residenza, telefono);
		this.materia = materia;
	}

	protected String getMateria() {
		return materia;
	}

	protected void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	protected void setEta(int eta) {
		int eta_new = eta >= 26 && eta <= 65 ? eta : 26;
		super.setEta(eta_new); //Richoama il metodo del padre
	}
	
	
	
	@Override
	public String toString() {
		return "Docente [materia=" + materia + ", getNome()=" + getNome() + ", getCognome()=" + getCognome() + "]";
	}

	@Override
	public String saluta() {
		return "Buongiorno son il prof. " + getNome() + " " + getCognome() + " e insegno " + materia;
	}
	

}
