// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #3, 3/3/16
// This program returns the tickets sold and profits.
public class TestTicket {
	public static void main(String[] args) {
		printStats(sortTickets()); //This calls other methods to print the ticket.

		}
		
	public static void printStats(RegularTicket[] store){ //This method prints the statistics of the array.
		double totalprice=0;
		for (int i=0; i<=14; i++){
			store[i].print();
			totalprice = totalprice + store[i].getPrice();
		}
		System.out.print(totalprice);
	}
	
	public static RegularTicket[] sortTickets(){ //This method sorts the tickets into an array.
		RegularTicket[] store = new RegularTicket[15];
		int[] days = {30, 15,3};
		for (int i=0; i<=2; i++){
		store[i] = new RegularTicket(i+1);
		store[i+5] = new AdvanceTicket(i+6,days[i]);
		store[i+8] = new StudentAdvanceTicket(i+9,days[i]);
		}
		for (int i=3; i<=4; i++){
		store[i] = new WalkupTicket(i+1);
		}
		for (int i=11; i<=14; i++){
		store[i] = new RegularTicket(i+1);
		}
		return store;
	}
}
	
