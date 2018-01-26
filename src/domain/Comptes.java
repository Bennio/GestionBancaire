package domain;

public class Comptes {
	private int numCompte ;
	private int idTitulaireCompte;
	private String nomTitulaire;
	private Double solde;
	private Double taux;
	
	public Comptes( ) {
	}

	public Comptes(int numCompte, int idTitulaireCompte, String nomTitulaire, Double solde) {
		this.numCompte = numCompte;
		this.idTitulaireCompte = idTitulaireCompte;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}
	
	public void deposer(Double depot) {
		System.out.println("---- Deposer un montant  de " +depot);
		this.solde += depot;
	}
	
	public void retrait(Double r) {
		System.out.println("---- Retirer un montant de " + r);
		this.solde -= r;
	}
	
	public void afficher() {
		System.out.println("Le solde de votre compte est " + this.solde);
	}

	/**
	 * @return the numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

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
