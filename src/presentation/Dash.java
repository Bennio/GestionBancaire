package presentation;
import domain.Comptes;
public class Dash {

	public Dash() {
	}

	public static void main(String[] args) {
		Comptes compte = new Comptes(12345,25,"Bendy Latortue", 7000.00);
		String output = String.format("Id Titulaire Compte = %d \nNom du Titulaire = %s  \nNumero Compte = %d \nSolde Initial = %4.3f \n", compte.getIdTitulaireCompte(),compte.getNomTitulaire(), compte.getNumCompte(), compte.getSolde() );
		System.out.print(output);
		
		compte.deposer(1000.00);
		compte.afficher();
		compte.retrait(3000.00);
		compte.afficher();
		
		
		

	}

}
