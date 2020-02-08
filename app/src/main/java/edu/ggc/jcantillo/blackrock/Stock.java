package edu.ggc.jcantillo.blackrock;
import java.util.Date;


public class Stock {
    private String purchaseDate;
    private String sellDate;
    private double purchaseValue;
    private double currentStockValue;
    private int quantityOwned;
    private String stockName;


    public Stock(String stockName, double purchaseValue){
        purchaseDate = new Date()+"";
        this.stockName = stockName;
        this.purchaseValue = purchaseValue;
        this.sellDate = "";
        this.currentStockValue

    }
}
