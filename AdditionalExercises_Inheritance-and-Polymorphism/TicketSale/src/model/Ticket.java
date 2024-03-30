package model;

public class Ticket {

	private String ticketID;
	private float ticketBasePrice;
	
	public Ticket() {
		super();
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public float getTicketBasePrice() {
		return ticketBasePrice;
	}

	public void setTicketBasePrice(float ticketBasePrice) {
		this.ticketBasePrice = ticketBasePrice;
	}
	
	public float calculateFinalTicketPrice(double convenienceFee) {
		float ticketFinalPrice = (float) ((ticketBasePrice * convenienceFee) + ticketBasePrice);
		return ticketFinalPrice;
	}

}
