package presentation;
import domain.Comptes;
public class Dash {

	public Dash() {
	}

	public static void main(String[] args) {
		Comptes compte = new Comptes(12345);
		System.out.println(compte.getNumCompte());
		

	}

}
