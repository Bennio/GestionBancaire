package domain;

public class Bank {
	private double tauxDInteret = 5.5;
	private double coutTransaction = 3;
	private Clients[] clients = new Clients[2500];
	
	public void calculInteret(Clients clients) {
		Comptes cpt = clients.getComptes();
		double solde = cpt.getSolde();
		double interet = solde * tauxDInteret / 100;
		double totalSolde = solde + interet;
		System.out.println("Interet = "+interet+ " solde apres ajout d'Interet = "+totalSolde);
	
	}
	
	public double getTauxDInteret() {
		return tauxDInteret;
	}
	
	public double getCoutTransaction() {
		return coutTransaction;
	}
	public Clients[] getClients() {
		return clients;
	}
}
