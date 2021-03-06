package domain;



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

	Transactions transactions = new Transactions();

	public void deposer(float qte) {
		
		if (qte > 0) {
			solde = solde + qte;
			String messageDepot = "un montant de " + qte + " a ete Depose sur le compte " +getNumCompte()+" de "+getNomTitulaire()+ ". Le nouveau solde est " + solde;
//			String messageDepot = "montant";
			System.out.println(messageDepot);
			
			transactions.history(messageDepot);
		} else {
			System.err.println("Le depot ne doit pas etre negatif");
		}
	}
	
	/**
	 * @param qte
	 */
	public void retrait(float qte) {
		if (qte >= 0) {
			
			float tempSolde = solde;
			tempSolde = tempSolde - qte;
			if (tempSolde >= 50) {
				solde = solde - qte;
				String messageRetrait = "un montant de " + qte + " Euros a ete Retire sur le compte " +getNumCompte()+" de "+getNomTitulaire()+ ".Le nouveau solde est "
						+ solde + " Euros";
				System.out.println(messageRetrait);
				
				transactions.history(messageRetrait);
			} else {
				System.err.println("Solde insuffisant pour retirer " + qte + " Euros");
			}
		} else {
			System.err.println("Il faut rentrer un nombre positif");
		}

	}

	public void calculInteret(int tauxInteret) {
//		Bank bank = new Bank();
		float solde = getSolde();
		float interet = solde * tauxInteret / 100;
		float totalSolde = solde + interet;
		setSolde(totalSolde);
		System.out.println("Interet "+tauxInteret+"% est " + interet + " Euros, solde apres ajout d'Interet = " + totalSolde);

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
	 * the solde to set
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
		return "Nom du titulaire\t" + nomTitulaire  + "\nl'ID du Titulaire\t " + idTitulaire + "\nLe Numero du Compte\t  " + numCompte + "\nLa Balance\t\t " + getSolde() + " Euros\n";
	}
	
	

}
