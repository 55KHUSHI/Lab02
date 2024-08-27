package StockManagement;

public class StockMain {
	
    public static void main(String[] args) {
        // Create a Stock object
        Stock appleStock = new Stock("AAPL", "Apple Inc.");

        // Set previous and current prices
        appleStock.setPreviousClosingPrice(145.30);
        appleStock.setCurrentPrice(149.50);

        // Print stock details
        System.out.println("Stock Symbol: " + appleStock.getSymbol());
        System.out.println("Stock Name: " + appleStock.getName());
        System.out.println("Previous Closing Price: $" + appleStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + appleStock.getCurrentPrice());
        System.out.printf("Price Change Percentage: %.2f%%\n", appleStock.getChangePercent());
    }
}
