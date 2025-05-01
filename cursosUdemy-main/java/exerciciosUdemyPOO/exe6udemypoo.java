import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class exe6udemypoo {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amount());



        sc.close();
    }
}
