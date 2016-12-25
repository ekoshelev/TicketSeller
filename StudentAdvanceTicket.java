// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This is the student advance ticket subclass.
public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int x, int days) { //This constructs the studentadvanceticket object.
		super(x, days);
		price = determinePrice() / 2;
	}
	
	public String print(){ //This prints the ticket information.
		System.out.println("Ticket number = " + ticket  + " and price = " + price +" and days = " + days + " *ID Required");
		return "Ticket number = " + ticket +  "and price = " + price + "and days = " + days + " *ID Required";
	}

}
