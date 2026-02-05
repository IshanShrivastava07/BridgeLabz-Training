package FutureLogistics;

public class TimberTransport extends GoodsTransport {

	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	public TimberTransport(String transportID, String transportDate, int transportRating, float timberLength,
			float timberRadius, String timberType, float timberPrice) {
		super(transportID, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	@Override
	public String vehicleSelection() {
		StringBuilder vehicleBuilder = new StringBuilder();
		double area = 2 * 3.147 * timberRadius * timberLength;
		if(area < 250) {
			vehicleBuilder.append("Truck");
		}
		else if(area >= 250 && area <= 400) {
			vehicleBuilder.append("Lorry");
		}
		else if(area > 400) {
			vehicleBuilder.append("MonsterLorry");
		}
		return vehicleBuilder.toString();
	}
	
	
	
	@Override
	public float calculateTotalCharge() {
		double volume = 3.147 * timberRadius * timberRadius * timberLength;
		
		double premium = 0;
		if(timberType.equals("Premium")) {
			premium = 0.25;
		}else if(timberType.equals("NonPremium")) {
			premium = 0.15;
		}
		double price = volume * timberPrice * premium;
		double tax = price * 0.3;
		double vehiclePrice = 0;
		if(vehicleSelection().equalsIgnoreCase("truck")) {
			vehiclePrice = 1000;
		}
		if(vehicleSelection().equalsIgnoreCase("Lorry")){
			vehiclePrice = 1700;
		}
		if(vehicleSelection().equalsIgnoreCase("monsterlorry")){
			vehiclePrice = 3000;
		}
		double discountPercentage = 0;
		if(getTransportRating() == 5) {
			discountPercentage = 0.20;
		}
		else if(getTransportRating() == 3 || getTransportRating() == 4) {
			discountPercentage = 0.10;
		}
		else if(getTransportRating() <= 2) {
			discountPercentage*= 1;
		}
		double discount = price * discountPercentage;
		double totalCharge = (price + vehiclePrice + tax ) - discount;
		return (float) totalCharge;
	}
	@Override
	public String toString() {
		return "timberLength=" + timberLength + ", \ntimberRadius=" + timberRadius + ", \ntimberType="
				+ timberType + ", \ntimberPrice=" + timberPrice + ", \ntransportID=" + transportID + ", \ntransportDate="
				+ transportDate + ", \ntransportRating=" + transportRating ;
	}

	
	
}
