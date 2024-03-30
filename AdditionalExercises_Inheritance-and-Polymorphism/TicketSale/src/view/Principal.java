package view;

import model.Ticket;
import model.TicketVIP;

public class Principal {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		
		t1.setTicketID("123456789");
		t1.setTicketBasePrice(500.00f);
		float t1Price = t1.calculateFinalTicketPrice(0.05d);
		
		System.out.println("Ticket ID = " + t1.getTicketID());
		System.out.println("Price = $" + t1Price);
		System.out.println("*************************************");
		
		TicketVIP t2 = new TicketVIP();
		
		t2.setTicketID("987654321");
		t2.setTicketBasePrice(500.00f);
		t2.setFunctionClient("Developer");
		float t2Price = t2.calculateFinalTicketPrice(0.05d);
		
		System.out.println("Ticket ID = " + t2.getTicketID());
		System.out.println("Client Function = " + t2.getFunctionClient());
		System.out.println("Price = $" + t2Price);
		
	}

}
