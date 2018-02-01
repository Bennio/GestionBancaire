package domain;

import java.util.Scanner;

public class Menu {
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Gestion Bancaire");
        System.out.println("-------------------------\n");
        System.out.println("1 - Ajouter Client");
        System.out.println("2 - Faire un depot");
        System.out.println("3 - Faire un Retrait");
        System.out.println("4 - Verifier Balance");
        System.out.println("5 - Calcul Interet");
        System.out.println("6 - Rapport");
        System.out.println("7 - Quitte(X)");
        
        System.out.print("Ton Choix:");
        selection = input.nextInt();
        return selection;    
    }

}
