/**
 * 
 */
package domain;

/**
 * Cette classe est un test pour creer une liste de compte
 * @author bennio
 * @version 0.0.1
 */
public class Comptess {
	
	private int numeroCpte;
	private int idTutulaire;
	private String nomTutulaire;
	private float solde;

	/**
	 * Constructeur par defaut de la classe Compte
	 */
	public Comptess() {
		super();
	}

	/**
	 * Constructeur avec tous les parametre de la classe Compte
	 * @param numeroCpte
	 * @param idTutulaire
	 * @param nomTutulaire
	 * @param solde
	 */
	public Comptess(int numeroCpte, int idTutulaire, String nomTutulaire, float solde) {
		super();
		this.numeroCpte = numeroCpte;
		this.idTutulaire = idTutulaire;
		this.nomTutulaire = nomTutulaire;
		this.solde = solde;
	}
	
	//GETTERS AND SETTERS

	/**
	 * @return the numeroCpte
	 */
	public int getNumeroCpte() {
		return numeroCpte;
	}

	/**
	 * @param numeroCpte the numeroCpte to set
	 */
	public void setNumeroCpte(int numeroCpte) {
		this.numeroCpte = numeroCpte;
	}

	/**
	 * @return the idTutulaire
	 */
	public int getIdTutulaire() {
		return idTutulaire;
	}

	/**
	 * @param idTutulaire the idTutulaire to set
	 */
	public void setIdTutulaire(int idTutulaire) {
		this.idTutulaire = idTutulaire;
	}

	/**
	 * @return the nomTutulaire
	 */
	public String getNomTutulaire() {
		return nomTutulaire;
	}

	/**
	 * @param nomTutulaire the nomTutulaire to set
	 */
	public void setNomTutulaire(String nomTutulaire) {
		this.nomTutulaire = nomTutulaire;
	}

	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}

	/**
	 * Redefinition Methode toString()
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numeroCpte + " " + idTutulaire + " " + nomTutulaire + " " + solde ;
	}

}
