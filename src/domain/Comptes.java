package domain;

public class Comptes {
	private int numCompte;
	private int idTitulaireCompte;
	private String nomTitulaire;
	private double solde;
	private double taux;

	public Comptes(int numCompte ) {
		this.numCompte = numCompte;
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
	

}
