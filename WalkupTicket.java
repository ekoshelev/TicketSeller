// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This is the walkup ticket subclass.
public class WalkupTicket extends RegularTicket {
	protected double price=50;
	
	public WalkupTicket(int x) { //This constructs the walkup ticket object.
		super(x);
	}
	
	public String print(){ //This prints the ticket information.
		System.out.println("Ticket number = Walkup " + ticket + " and price = " + price);
		return "Ticket number = " + ticket + "price = " + price;
	}
}
