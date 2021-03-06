package edu.ggc.jcantillo.blackrock;
import java.util.Date;


public class Stock {
    private String purchaseDate;
    private String sellDate;
    private double purchaseValue;
    private String stockName;
    private int quantityOwned;

    public Stock(String stockAbbreviation){
        this.stockName = stockAbbreviation;
        purchaseDate = "5:19am";
        purchaseValue = getCurrentValue(stockAbbreviation);
        this.quantityOwned = 0;
    }

    public double getCurrentValue(String stockAbreviation){
        //THIS METHOD WOULD ACCESS THE API AND RETURN THE CURRENT VALUE
        double returnedValue = 250.0;
        return returnedValue;
    }

    public String getstockName() {
        return stockName;
    }

    public void setQuantityOwned(int quantityOwned) {
        this.quantityOwned = quantityOwned;
    }

    public int getQuantityOwned(){
        return quantityOwned;
    }

}
