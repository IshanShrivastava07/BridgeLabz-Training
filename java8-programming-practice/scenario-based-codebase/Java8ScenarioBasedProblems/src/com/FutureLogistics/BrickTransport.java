package com.FutureLogistics;

public class BrickTransport extends GoodsTransport {

	private float brickSize;
	private int brickQuantity;
	private float brickprice;

	public BrickTransport(String transportID, String transportDate, int transportRating, float brickSize,
			int brickQuantity, float brickprice) {
		super(transportID, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickprice = brickprice;
	}

	@Override
	public String vehicleSelection() {
		if (brickQuantity < 300) {
			return "Truck";
		} else if (brickQuantity >= 300 && brickQuantity <= 500) {
			return "Lorry";
		} else {
			return "MonsterLorry";
		}
	}

	@Override
	public String toString() {
		return "BrickTransport [brickSize=" + brickSize + ", brickQuantity=" + brickQuantity + ", brickprice="
				+ brickprice + "]";
	}

	@Override
	public float calculateTotalCharge() {

		float price = brickprice * brickQuantity;

		float vehiclePrice = 0;
		if (vehicleSelection().equalsIgnoreCase("truck")) {
			vehiclePrice = 1000;
		}
		if (vehicleSelection().equalsIgnoreCase("Lorry")) {
			vehiclePrice = 1700;
		}
		if (vehicleSelection().equalsIgnoreCase("monsterlorry")) {
			vehiclePrice = 3000;
		}

		double discountPercentage = 0;

		if (getTransportRating() == 5) {
		    discountPercentage = 0.20;
		} else if (getTransportRating() == 3 || getTransportRating() == 4) {
		    discountPercentage = 0.10;
		}

		double discount = price * discountPercentage;


		double tax = price * 0.3;
		double totalCharge = (price + vehiclePrice + tax) - discount;

		return (float) totalCharge;
	}

	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickprice() {
		return brickprice;
	}

	public void setBrickprice(float brickprice) {
		this.brickprice = brickprice;
	}

}
