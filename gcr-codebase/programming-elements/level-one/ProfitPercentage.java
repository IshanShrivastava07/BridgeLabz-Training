class ProfitPercentage{
	public static void main(String args[]){
		//Cost Price 
		int costPrice = 129;
		//Selling Price
		int sellingPrice = 191;
		//Calculating profit by substracting selling price with cost price
		double profit = sellingPrice - costPrice;
		//profit percentage 
		double profitPercentage = (profit / costPrice) * 100;
          //Displaying output
  System.out.print("The Cost Price is INR " + costPrice + "and Selling Price is INR " + sellingPrice + "\n" +
"The Profit is INR " + profit + "and the Profit Percentage is " + profitPercentage);
	}
}	