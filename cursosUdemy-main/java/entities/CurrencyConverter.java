package entities;

public class CurrencyConverter {
    public static double dollarPrice;
    public static double quantity;
    public static final double IOF = 0.06;
    //public static double total;
    
    public static double price(){
        return dollarPrice;
    }
    
    public static double qtd(){
        return quantity;
    }
    public static double amount(){
        double tax;
        dollarPrice *= quantity;
        tax = dollarPrice * IOF;
        return tax + dollarPrice;
    }
}
