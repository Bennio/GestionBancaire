package domain;

//import javax.swing.plaf.synth.SynthSpinnerUI;

public class Comptes {

	private int numCompte;
	private int idTitulaire;
	private String nomTitulaire;
	private float solde;
	// private double taux;

	/**
	 * Constructeur par defaut de la classe Compte
	 */
	public Comptes() {
		super();
	}

	/**
	 * @param numCompte
	 * @param idTitulaireCompte
	 * @param nomTitulaire
	 * @param solde
	 */
	public Comptes(int numCompte, int idTitulaire, String nomTitulaire, float solde) {
		super();
		this.numCompte = numCompte;
		this.idTitulaire = idTitulaire;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}

	// public Comptes(int numCompte) {
	// this.numCompte = numCompte;
	// }
	//
	// public Comptes(double solde, int numCompte) {
	// if (solde > 50) {
	// this.solde = solde;
	// } else {
	// this.solde = 50.0;
	// }
	// this.numCompte = numCompte;
	//
	// }
	//
	// public Comptes(double solde, int numCompte, int idTitulaireCompte, String
	// nomTitulaire) {
	// if (solde > 50) {
	// this.solde = solde;
	// } else {
	// this.solde = 50.0;
	// }
	// this.numCompte = numCompte;
	// this.idTitulaireCompte = idTitulaireCompte;
	// this.nomTitulaire = nomTitulaire;
	// }

	public void deposer(float qte) {
		if (qte > 0) {
			solde = solde + qte;
			System.out.println(
					"un montant de " + qte + " a ete Depose sur ton compte. " + "Le nouveau solde est " + solde);
		} else {
			System.err.println("Le depot ne doit pas etre negatif");
		}
	}
	
	/**
	 * @param qte
	 */
	public void retrait(float qte) {
		if (qte >= 0) {
			Bank bank = new Bank();
			float tempSolde = solde;
			tempSolde = tempSolde - qte - bank.getCoutTransaction();
			if (tempSolde >= 50) {
				solde = solde - qte - bank.getCoutTransaction();
				System.out.println("un montant de " + qte + " a ete Retire sur ton compte. " + "Le nouveau solde est "
						+ solde + " Euros");
			} else {
				System.err.println("Solde insuffisant pour retirer " + qte + " Euros");
			}
		} else {
			System.err.println("Il faut rentrer un nombre positif");
		}

	}

	public void calculInteret() {
		Bank bank = new Bank();
		float solde = getSolde();
		float interet = solde * bank.getTauxDInteret() / 100;
		float totalSolde = solde + interet;
		setSolde(totalSolde);
		System.out.println("Interet = " + interet + " solde apres ajout d'Interet = " + totalSolde);

	}

	/**
	 * @return the numCompte
	 */
	public int getNumCompte() {
		return numCompte;
	}

	/**
	 * @return the idTitulaireCompte
	 */
	public int getIdTitulaireCompte() {
		return idTitulaire;
	}

	/**
	 * @return the nomTitulaire
	 */
	public String getNomTitulaire() {
		return nomTitulaire;
	}

	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * @param numCompte
	 *            the numCompte to set
	 */
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @param idTitulaireCompte
	 *            the idTitulaireCompte to set
	 */
	public void setIdTitulaire(int idTitulaire) {
		this.idTitulaire = idTitulaire;
	}

	/**
	 * @param nomTitulaire
	 *            the nomTitulaire to set
	 */
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	/**
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numCompte + " " + idTitulaire + " " + nomTitulaire + " " + getSolde();
	}

}
