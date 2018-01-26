package domain;

import java.util.Scanner;

public class Menu {
	public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Gestion Bancaire");
        System.out.println("-------------------------\n");
        System.out.println("1 - Afficher Le solde");
        System.out.println("2 - Faire un depot");
        System.out.println("3 - Faire un Retrait");
        System.out.println("4 - Quitter");
        
        System.out.print("Ton Choix:");
        selection = input.nextInt();
        return selection;    
    }

}
