package Esercizi_OOP;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	
	public Rettangolo(double base, double altezza) {
		this.base = base >= 0 ? base : Math.abs(base);
		this.altezza = altezza >= 0 ? altezza : Math.abs(altezza);
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base >= 0 ? base : Math.abs(base);
	}


	public double getAltezza() {
		return altezza;
	}


	public void setAltezza(double altezza) {
		this.altezza = altezza >= 0 ? altezza : Math.abs(altezza);
	}


	@Override
	public String toString() {
		return "Rettangolo base = " + base + " altezza = " + altezza;
	}
	
	//Metodi
	public double Area() {
		return base * altezza;
	}
	
	public double Perimetro() {
		return (base + altezza) * 2;
	}
	
	
	

}
