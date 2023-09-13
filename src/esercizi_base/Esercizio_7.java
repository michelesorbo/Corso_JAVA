package esercizi_base;

public class Esercizio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Il maggiore dei numeri 5,3,9 è: " + trovaMassimo(5,3,9));

	}
	
	public static int trovaMassimo(int n1, int n2, int n3) {
		if(n1 > n2 && n1 > n3) {
			return n1;
		}else if(n2 > n1 && n2 > n3) {
			return n2;
		}else {
			return n3;
		}
	}

}
