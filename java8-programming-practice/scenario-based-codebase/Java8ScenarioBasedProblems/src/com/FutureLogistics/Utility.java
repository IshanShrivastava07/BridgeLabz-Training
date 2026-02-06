package com.FutureLogistics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

	public GoodsTransport parseDetails(String input) {
		String[] part = input.split(":");
		String tranportId = part[0].trim();
		String date = part[1].trim();
		int rating = Integer.parseInt(part[2].trim());
		String tranportType = part[3].trim();
		
		if (tranportType.equals("TimberTransport")) {

			float length = Float.parseFloat(part[4].trim());
			float radius = Float.parseFloat(part[5].trim());
			String timberType = part[6].trim();
			float price = Float.parseFloat(part[7].trim());

			GoodsTransport transport = new TimberTransport(tranportId, date, rating, length, radius, timberType, price);
			return transport;
			
			
		} else if (tranportType.equalsIgnoreCase("BrickTransport")) {
			float bricksize = Float.parseFloat(part[4].trim());
			int quantity = Integer.parseInt(part[5].trim());
			float price = Float.parseFloat(part[6].trim());

			GoodsTransport transport = new BrickTransport(tranportId, date, rating, bricksize, quantity, price);
			return transport;
		}
		return null;
	}

	public boolean validateTransportId(String transportId) {
		String regexString = "^RTS[0-9]{3}[A-Z]$";
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(transportId);

		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Transport id " + transportId + " is invalid" + " Please provide a valid record");
			return false;
		}

	}

	public String findObjectType(GoodsTransport goodsTransport) {
		if (goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		} else if (goodsTransport instanceof BrickTransport) {
			return "BrickTransport";
		}
		return null;
	}
}
