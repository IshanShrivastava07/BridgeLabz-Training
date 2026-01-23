package com.generics.dynamiconlinemarketplace;

public class OnlineMarketPlaceMainApp {

	public static void main(String[] args) {

		Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());

		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());

		Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory());

		ProductCatalog catalog = new ProductCatalog();

		catalog.addProduct(book);
		catalog.addProduct(shirt);
		catalog.addProduct(phone);

		System.out.println("Before Discount:");
		catalog.displayAll();

		System.out.println("\nApplying Discounts...");
		MarketplaceUtil.applyDiscount(book, 10);
		MarketplaceUtil.applyDiscount(shirt, 20);
		MarketplaceUtil.applyDiscount(phone, 5);

		System.out.println("\nAfter Discount:");
		catalog.displayAll();
	}
}
