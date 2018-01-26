package domain;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Comptes {
	private int numCompte ;
	private int idTitulaireCompte;
	private String nomTitulaire;
	static Double solde = 0.0;
	private Double taux;
	
	static public int getTransaction() {
		try {
			byte [] tampon = new byte[512];
			System.in.read(tampon);
			String c = new String(tampon);
			c = c.trim();
			
			return Integer.parseInt(c);
		}catch(Exception e) {
			System.out.println("Erreur");
		}
		return 0;
	}
	
	public Comptes( ) {
	}

//	public Comptes(int numCompte, int idTitulaireCompte, String nomTitulairee, Double solde) {
//		this.numCompte = numCompte;
//		this.idTitulaireCompte = idTitulaireCompte;
//		this.nomTitulaire = nomTitulaire;
//		this.solde = solde;
//	
//	}
	
	public void afficher() {
		System.out.println("Le solde de votre compte est " + solde);
	}
	
	public void deposer() {
		System.out.println("---- Deposer un montant  de " );
		int depot = getTransaction();
		solde += depot;
	}
	
	public void retrait() {
		System.out.println("---- Retirer un montant de " );
		int r = getTransaction();
		solde -= r;
	}
	
	

//	/**
//	 * @return the numCompte
//	 */
//	public int getNumCompte() {
//		return numCompte;
//	}
//
//	/**
//	 * @param numCompte the numCompte to set
//	 */
//	public void setNumCompte(int numCompte) {
//		this.numCompte = numCompte;
//	}

	/**
	 * @return the idTitulaireCompte
	 */
	public int getIdTitulaireCompte() {
		return idTitulaireCompte;
	}

	/**
	 * @param idTitulaireCompte the idTitulaireCompte to set
	 */
	public void setIdTitulaireCompte(int idTitulaireCompte) {
		this.idTitulaireCompte = idTitulaireCompte;
	}

	/**
	 * @return the nomTitulaire
	 */
	public String getNomTitulaire() {
		return nomTitulaire;
	}

	/**
	 * @param nomTitulaire the nomTitulaire to set
	 */
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	public void creerCompte(int numCompte, int idTitulaireCompte ) {
		
	}
	

}
