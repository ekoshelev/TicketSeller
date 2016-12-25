// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This is the advance ticket subclass.
public class AdvanceTicket extends RegularTicket {
	protected int days;
	
	public AdvanceTicket(int x, int days) { //This constructs the advance ticket object.
		super(x);		
		this.days = days;
		price=determinePrice();
	}
	
	public double determinePrice(){
		if (days>20){
			price = 15;
		} else if (days>10){
			price = 20;
		} else if (days <= 10 && days > 2){
			price=40;
		} else {
			price=50;
		}
		return price;
	}
	
	public String print(){
		System.out.println("Ticket number = " + ticket + " and price = " + determinePrice() + " and days = " + days);
		return "Ticket number = " + ticket + " and price = " + determinePrice() + " and days = " + days;
	}
}
