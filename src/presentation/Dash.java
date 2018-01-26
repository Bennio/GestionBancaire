package presentation;
import java.util.Scanner;

import domain.Comptes;
import domain.Menu;
public class Dash {

	public Dash() {
	}

	public static void main(String[] args) {
		int userChoice;
        Scanner input = new Scanner(System.in);
        
        /*********************************************************/
        do{
        		Menu menu = new Menu();
	            userChoice = menu.menu();
	            
	            switch (userChoice) {
	            case 1:
	            	Comptes compte = new Comptes();
//	        		String output = String.format("Id Titulaire Compte = %d \nNom du Titulaire = %s  \nNumero Compte = %d \nSolde Initial = %4.3f \n", compte.getIdTitulaireCompte(),compte.getNomTitulaire(), compte.getNumCompte(), compte.getSolde() );
//	        		System.out.print(output);
	            	compte.afficher();
	                break;
	            case 2:
	            	Comptes compte1 = new Comptes();
	            	compte1.deposer();
	        		compte1.afficher();
	                break;
	            case 3:
	            	Comptes compte2 = new Comptes();
	            	compte2.retrait();
	        		compte2.afficher();
	                break;
	            case 4:
	            	System.out.println("Au Revoir!");
	                break;
	           
	            default: 
	            	System.out.println("Mauvaise touche pressee!");
	            	break;
	            	
	
	        }
        }
        while(userChoice != 4);
		
		
		
		
		
		
		

	}

}
