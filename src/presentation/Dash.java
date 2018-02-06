package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Comptes;
import domain.Menu;
import domain.Transactions;

public class Dash {

	public Dash() {
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int userChoice;

		List<Comptes> compteList = new ArrayList<Comptes>();
//		List<String> transactionList = new ArrayList<String>();
		Transactions transactions = new Transactions();

		char reponse = 'o';
	

		/*********************************************************/
		do {
			Menu menu = new Menu();
			userChoice = menu.menu();

			switch (userChoice) {
			case 1:
				do {
					System.out.println("Creer un nouveau Compte \n");
					System.out.println("Mettre le montant Initial :");
					Scanner montant = new Scanner(System.in);
					float solde = montant.nextFloat();

					System.out.println("Mettre le numero de Compte :");
					Scanner numero = new Scanner(System.in);
					int numCompte = numero.nextInt();

					System.out.println("Mettre le nom du titulaire du Compte :");
					Scanner nomTitulaire = new Scanner(System.in);
					String nomT = nomTitulaire.nextLine();

					System.out.println("Mettre l'id du titulaire du Compte :");
					Scanner idTitulaire = new Scanner(System.in);
					int idT = idTitulaire.nextInt();

				

					Comptes Compte = new Comptes();
					Compte.setIdTitulaire(idT);
					Compte.setNomTitulaire(nomT);
					Compte.setNumCompte(numCompte);
					Compte.setSolde(solde);

					compteList.add(Compte);
					System.out.println("Voulez vous continuer?");
					Scanner sc = new Scanner(System.in);
					reponse = sc.nextLine().charAt(0);

				} while (reponse == 'o');

				for (Comptes compte : compteList) {

					System.out.println(compte);
				}

//				System.out.println("Nombre de Compte : " + compteList.size());

				
				break;
			case 2:

			

				System.out.println("Mettre le numero de Compte :");
				int numCompte = Integer.parseInt(bufferedReader.readLine());

				if (compteList.isEmpty()) {
					System.err.println("Compte introuvable.");
				} else {
					boolean trouver = false;
					for (Comptes compte2 : compteList) {
						int tempCompte = compte2.getNumCompte();
						if (tempCompte == numCompte) {
							System.err.println("Deposer un montant de :");
							Scanner montant = new Scanner(System.in);
							float montantDepot = montant.nextFloat();
							compte2.deposer(montantDepot);

							trouver = true;
						}

					}

					if (trouver == false) {
						System.err.println("Compte introuvable.");

					}
				}

				break;
			case 3:
				System.out.println("Mettre le numero de Compte :");
				numCompte = Integer.parseInt(bufferedReader.readLine());

				if (compteList.isEmpty()) {
					System.err.println("Compte introuvable.");
				} else {
					boolean trouver = false;
					for (Comptes compte2 : compteList) {
						int tempCompte = compte2.getNumCompte();
						if (tempCompte == numCompte) {
							System.err.println("Retirer un montant de :");
							Scanner montant = new Scanner(System.in);
							float mRetrait = montant.nextFloat();
							compte2.retrait(mRetrait);
							;

							trouver = true;
						}

					}

					if (trouver == false) {
						System.err.println("Compte introuvable.");

					}
				}

				break;
			case 4:
				System.out.println("Mettre le numero de Compte :");
				numCompte = Integer.parseInt(bufferedReader.readLine());

				if (compteList.isEmpty()) {
					System.err.println("Compte introuvable.");
				} else {
					boolean trouver = false;
					for (Comptes compte2 : compteList) {
						int tempCompte = compte2.getNumCompte();
						if (tempCompte == numCompte) {
							System.out.println("La Balance de votre compte est :" + compte2.getSolde() + " Euros");

							trouver = true;
						}

					}

					if (trouver == false) {
						System.err.println("Compte introuvable.");

					}
				}

				break;
			case 5:
				System.out.println("Mettre le numero de Compte :");
				numCompte = Integer.parseInt(bufferedReader.readLine());

				if (compteList.isEmpty()) {
					System.err.println("Compte introuvable.");
				} else {
					boolean trouver = false;
					System.out.println("Le pourcentage d'Interet :");
					int interet = Integer.parseInt(bufferedReader.readLine());
					for (Comptes compte2 : compteList) {
						int tempCompte = compte2.getNumCompte();
						
						if (tempCompte == numCompte) {

							compte2.calculInteret(interet);
							trouver = true;
						}

					}

					if (trouver == false) {
						System.err.println("Compte introuvable.");

					}
				}
				
				break;
			case 6:
//				transactio
				//System.out.println("Moi");
				transactions.afficherHistory();
			
//				Comptes compte = new Comptes();
				
				
				break;
			case 7:
				System.out.println("Au Revoir");
				System.exit(0);
				break;

			default:
				System.out.println("Mauvaise touche pressee!");
				break;

			}

		} while (userChoice != 7);

	}

}
