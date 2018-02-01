package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import domain.Bank;
import domain.Comptes;
import domain.Comptess;
import domain.Menu;

public class Dash {

	public Dash() {
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int userChoice;
		// Scanner input = new Scanner(System.in);
		List<Comptess> compteList = new ArrayList<Comptess>();
		Comptess comptess = new Comptess();
		char reponse = 'o';
		int nombreClients = 0;
		Bank bank = new Bank();
		// Clients[] c = bank.getClients();
		/*********************************************************/
		do {
			Menu menu = new Menu();
			userChoice = menu.menu();
	
			switch (userChoice) {
			case 1:
				do {
					System.out.println("Creer un Compte :");
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
					
					// Clients clients = new Clients(nomTitulaire, idTitulaire, compte);
					// Comptes compte = new Comptes(solde, numCompte, idTitulaire, nomTitulaire );

					comptess.setIdTutulaire(idT);
					comptess.setNomTutulaire(nomT);
					comptess.setNumeroCpte(numCompte);
					comptess.setSolde(solde);
					
					compteList.add(comptess);
					System.out.println("Voulez vous continuer?");
					Scanner sc = new Scanner(System.in);
					reponse = sc.nextLine().charAt(0);
					
				} while (reponse == 'o');

				for (Comptess compte2 : compteList) {

					System.out.println(compte2);
				}
				
				System.out.println("La taille du tableau est de : " + compteList.size());

				// c[nombreClients] = clients;
				// System.out.println("Nom du titulaire :" + nomTitulaire + "\n l'ID du
				// Titulaire :" + idTitulaire + "\nLe Numero du Compte :" + numCompte + " \nLa
				// balance :"+ solde +"\n ont ete ajoutes");
				// nombreClients++;
				break;
			case 2:
				System.out.println("oka");
				/*
				 * System.out.println("Mettre le numero de Compte :"); numCompte =
				 * Integer.parseInt(bufferedReader.readLine()); if(nombreClients == 0) {
				 * System.err.println("Compte introuvable."); }else { boolean trouver = false;
				 * for (int i = 0; i < compteList.size() ; i++) { Comptes temp =
				 * c[i].getComptes(); int tempCompte = temp.getNumCompte(); if (tempCompte ==
				 * numCompte ) { System.err.println("Deposer un montant de :"); double montant =
				 * Double.parseDouble(bufferedReader.readLine()); temp.deposer(montant);
				 * 
				 * trouver = true; } }
				 * 
				 * if (trouver == false) { System.err.println("Compte introuvable."); } }
				 */
				break;
			case 3:
				/*
				 * System.out.println("Mettre le numero de Compte :"); numCompte =
				 * Integer.parseInt(bufferedReader.readLine()); if(nombreClients == 0) {
				 * System.err.println("Compte introuvable."); }else { boolean trouver = false;
				 * for (int i = 0; i < nombreClients; i++) { Comptes temp = c[i].getComptes();
				 * int tempCompte = temp.getNumCompte(); if (tempCompte == numCompte ) {
				 * System.err.println("Retirer un montant de :"); double montant =
				 * Double.parseDouble(bufferedReader.readLine()); temp.retrait(montant);
				 * 
				 * trouver = true; } }
				 * 
				 * if (trouver == false) { System.err.println("Compte introuvable."); } }
				 */

				break;
			case 4:
				/*
				 * System.err.println("Mettre le numero de Compte :"); numCompte =
				 * Integer.parseInt(bufferedReader.readLine()); if(nombreClients == 0) {
				 * System.err.println("Compte introuvable."); }else { boolean trouver = false;
				 * for (int i = 0; i < nombreClients; i++) { Comptes temp = c[i].getComptes();
				 * int tempCompte = temp.getNumCompte(); if (tempCompte == numCompte ) {
				 * System.out.println("La Balance de votre compte est :" +temp.getSolde());
				 * 
				 * trouver = true; } }
				 * 
				 * if (trouver == false) { System.err.println("Compte introuvable."); } }
				 */
				break;
			case 5:
				/*
				 * System.err.println("Mettre le numero de Compte :"); numCompte =
				 * Integer.parseInt(bufferedReader.readLine()); if(nombreClients == 0) {
				 * System.err.println("Compte introuvable."); }else { boolean trouver = false;
				 * for (int i = 0; i < nombreClients; i++) { Comptes temp = c[i].getComptes();
				 * int tempCompte = temp.getNumCompte(); if (tempCompte == numCompte ) {
				 * bank.calculInteret(c[i]); trouver = true; } }
				 * 
				 * if (trouver == false) { System.err.println("Compte introuvable."); } }
				 */
				break;
			case 6:
				// System.out.println("ok");
				for (Comptess compte2 : compteList) {

					System.out.println(compte2);
				}
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
