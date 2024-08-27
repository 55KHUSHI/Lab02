package StockManagement;

public class Stock {
	
    // Private data fields
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor to initialize stock fields
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Getter and Setter methods for symbol
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Getter and Setter methods for currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Method to calculate and return the percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
