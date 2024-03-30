package model;

public class TicketVIP extends Ticket {

	private String functionClient;
	
	public TicketVIP() {
		super();
	}

	public String getFunctionClient() {
		return functionClient;
	}

	public void setFunctionClient(String functionClient) {
		this.functionClient = functionClient;
	}
	
	@Override
	public float calculateFinalTicketPrice(double convenienceFee) {
		float ticketFinalPrice = (float) ((getTicketBasePrice() * convenienceFee) + getTicketBasePrice());
		ticketFinalPrice += (ticketFinalPrice * 0.18);
		return ticketFinalPrice;
	}

}
