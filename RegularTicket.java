// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This is the regular ticket class.
public class RegularTicket {
	protected int ticket;
	protected double price=40;
	
	public RegularTicket(int x){ //This constructs the ticket object.
		ticket = x;
	}
	
	public double getPrice(){ //This returns the price.
		return price; 
	}
	
	public String print(){ //This prints the ticket information.
		System.out.println("Ticket number = " + ticket + " and price = " + price);
		return "Ticket number = " + ticket + " and price = " + price;
	}

}
