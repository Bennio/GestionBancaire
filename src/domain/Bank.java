package domain;

public class Bank {
	private float tauxDInteret = 5f;
	private float coutTransaction = 3f;
	private Clients[] clients = new Clients[2500];

	/*public void calculInteret(Clients clients) {
		Comptes cpt = clients.getComptes();
		double solde = cpt.getSolde();
		double interet = solde * tauxDInteret / 100;
		double totalSolde = solde + interet;
		System.out.println("Interet = " + interet + " solde apres ajout d'Interet = " + totalSolde);

	}*/
	
	public float getTauxDInteret() {
		return tauxDInteret;
	}

	public float getCoutTransaction() {
		return coutTransaction;
	}

	public Clients[] getClients() {
		return clients;
	}
}
