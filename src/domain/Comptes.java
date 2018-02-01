package domain;

//import javax.swing.plaf.synth.SynthSpinnerUI;

public class Comptes {
	

	private int numCompte;
	private int idTitulaireCompte;
	private String nomTitulaire;
	private Double solde = 50.0;
	// private double taux;

	/**
	 * 
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
	public Comptes(int numCompte, int idTitulaireCompte, String nomTitulaire, Double solde) {
		super();
		this.numCompte = numCompte;
		this.idTitulaireCompte = idTitulaireCompte;
		this.nomTitulaire = nomTitulaire;
		this.solde = solde;
	}
	
	

//	public Comptes(int numCompte) {
//		this.numCompte = numCompte;
//	}
//
//	public Comptes(double solde, int numCompte) {
//		if (solde > 50) {
//			this.solde = solde;
//		} else {
//			this.solde = 50.0;
//		}
//		this.numCompte = numCompte;
//
//	}
//
//	public Comptes(double solde, int numCompte, int idTitulaireCompte, String nomTitulaire) {
//		if (solde > 50) {
//			this.solde = solde;
//		} else {
//			this.solde = 50.0;
//		}
//		this.numCompte = numCompte;
//		this.idTitulaireCompte = idTitulaireCompte;
//		this.nomTitulaire = nomTitulaire;
//	}

	public void deposer(double qte) {
		if (qte > 0) {
			solde = solde + qte;
			System.out.println(
					"un montant de " + qte + " a ete Depose sur ton compte. " + "Le nouveau solde est " + solde);
		} else {
			System.err.println("Le depot ne doit pas etre negatif");
		}
	}

	public void retrait(double qte) {
		if (qte >= 0) {
			Bank bank = new Bank();
			double tempSolde = solde;
			tempSolde = tempSolde - qte - bank.getCoutTransaction();
			if (tempSolde >= 50) {
				solde = solde - qte - bank.getCoutTransaction();
			} else {
				System.err.println("Solde insuffisant pour retirer " + qte + " Euros");
			}
		} else {
			System.err.println("Il faut rentrer un nombre positif");
		}

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
		return idTitulaireCompte;
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
	public double getSolde() {
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
	public void setIdTitulaireCompte(int idTitulaireCompte) {
		this.idTitulaireCompte = idTitulaireCompte;
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
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numCompte + " " + idTitulaireCompte + " " + nomTitulaire + " " + getSolde();
	}

	

}
