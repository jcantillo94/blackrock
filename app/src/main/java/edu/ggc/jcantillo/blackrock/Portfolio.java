package edu.ggc.jcantillo.blackrock;
import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Stock> stocksOwned = new ArrayList<Stock>();
    private ArrayList<Stock> stocksSold;
    private double cashValue;
    private double stocksValue;
    private double startingValue;
    private double portfolioValue;


    public Portfolio(double initialInvestment){
        this.startingValue = initialInvestment;
        this.cashValue = initialInvestment;
        this.stocksValue = 0;
        this.portfolioValue = cashValue + stocksValue;

    }

    public void purchaseStock(String stockName, int quantity){

        System.out.println("Quantity " + quantity);

        //temporary Stock variable to hold the stock information
        Stock tempStock = new Stock(stockName);
        tempStock.setQuantityOwned(quantity);
        System.out.println(tempStock.getQuantityOwned());

        //calculates transaction cost based on current price of stock and quantity
        double purchaseCost = tempStock.getCurrentValue(stockName) * quantity;

        if (purchaseCost <= startingValue) {


            stocksOwned.add(tempStock); //add it to stock list
            cashValue -= purchaseCost;
            stocksValue += purchaseCost;

            System.out.println("Stock purchased!");
        }

        else {
            System.out.println("You don't have the funds to purchase that many stocks.  Try again.");
        }


    }


    public ArrayList<Stock> getStocksOwned(){
        return stocksOwned;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getStartingValue() {
        return startingValue;
    }

    public double getStocksValue() {
        return stocksValue;
    }

    public double calculatePortfolioPercentIncrease(){
        double perfectIncrease = 1.0 - (startingValue / portfolioValue);
        return perfectIncrease;
    }

}
