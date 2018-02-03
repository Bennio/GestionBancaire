package domain;

public class Clients {
	private String nomTitulaire;
	private int idTitulaire;
	private Comptes comptes;

	public Clients(String nomTitulaire, int idTitulaire, Comptes comptes) {
		this.nomTitulaire = nomTitulaire;
		this.idTitulaire = idTitulaire;
		this.comptes = comptes;

	}

	public void display() {
		System.out.println("Nom: " + nomTitulaire + " ID: " + idTitulaire + ", Numero Compte: " + comptes.getNumCompte()
				+ ", Solde: " + comptes.getSolde());
	}

	/**
	 * @return the nomTitulaire
	 */
	public String getNomTitulaire() {
		return nomTitulaire;
	}

	/**
	 * @return the idTitulaire
	 */
	public int getIdTitulaire() {
		return idTitulaire;
	}

	/**
	 * @return the cpt
	 */
	public Comptes getComptes() {
		return comptes;
	}

}
