package com.FutureLogistics;

public abstract class GoodsTransport {

	protected String transportID;
	protected String transportDate;
	protected int transportRating;
	
	public GoodsTransport(String transportID, String transportDate, int transportRating) {
		super();
		this.transportID = transportID;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}

	public String getTransportID() {
		return transportID;
	}

	public void setTransportID(String transportID) {
		this.transportID = transportID;
	}

	public String getTransportDate() {
		return transportDate;
	}

	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}

	@Override
	public String toString() {
		return "GoodsTransport [transportID=" + transportID + ", transportDate=" + transportDate + ", transportRating="
				+ transportRating + "]";
	}

	public int getTransportRating() {
		return transportRating;
	}

	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
	abstract public String vehicleSelection();
	
	abstract public float calculateTotalCharge();
}
