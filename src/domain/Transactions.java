package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;

import java.util.List;

public class Transactions {
//	private Date date = SystemClockFactory.
	SimpleDateFormat formater = null; 
	
//	Date aujourdhui = new Date();
//	formater = new SimpleDateFormat("dd MMMMM yyyy GGG, hh:mm aaa");
//    System.out.println(formater.format(aujourdhui));
	
	/**
	 * Constructeur par defaut de la classe Transactions
	 */
	public Transactions() {

	}
	
	List<String> transactionList = new ArrayList<String>();
	
	public void history(String transaction) {
		
		transactionList.add(transaction);
		//System.out.println(aujourdhui.getTime());
	}
	
	public void afficherHistory() {
		for (String string : transactionList) {
			System.out.println(string);
		}
		
		 
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transactions [transactionList=" + transactionList + "]";
	}
	
	

}
