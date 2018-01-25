package presentation;
import domain.Comptes;
public class Dash {

	public Dash() {
	}

	public static void main(String[] args) {
		Comptes compte = new Comptes(12345,25,"Bendy Latortue");
		
		String output = String.format("Id Titulaire Compte = %d \nNom du Titulaire = %s  \nNumero Compte = %d", compte.getIdTitulaireCompte(),compte.getNomTitulaire(), compte.getNumCompte() );
		System.out.print(output);
		
		

	}

}
