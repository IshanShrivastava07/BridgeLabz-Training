package FutureLogistics;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details");
		String input = sc.nextLine();

		Utility utility = new Utility();
		GoodsTransport transport = utility.parseDetails(input);
		if (!utility.validateTransportId(transport.transportID)) {
			return;
		}

		String type = utility.findObjectType(transport);

		System.out.println("\nTransporter id : " + transport.getTransportID());
		System.out.println("Date of transport : " + transport.getTransportDate());
		System.out.println("Rating of the transport : " + transport.getTransportRating());

		if (type.equals("BrickTransport")) {
			BrickTransport bt = (BrickTransport) transport;
			System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
			System.out.println("Brick price : " + bt.getBrickprice());
		} else {
			TimberTransport tt = (TimberTransport) transport;
			System.out.println("Type of the timber : " + tt.getTimberType());
			System.out.println("Timber price per kilo : " + tt.getTimberPrice());
		}

		System.out.println("Vehicle for transport : " + transport.vehicleSelection());
		System.out.println("Total charge : " + transport.calculateTotalCharge());
	}
}
