import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class exe2udemypoo{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    Product product;
    product = new Product();
    
    System.out.println("Enter product data");
    System.out.println("Name: ");
    product.name = sc.nextLine();
    System.out.println("Price: ");
    product.price = sc.nextDouble();
    System.out.println("Quantity in stock: ");
    product.quantity = sc.nextInt();        
    
    System.out.println();
    System.out.println("Product Data: " + product);

    System.out.println("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);
    System.out.println();
    System.out.println("Updated Data: " + product);

    System.out.println("Enter the number of products to be remove in stock: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);
    System.out.println("Updated Data: " + product);
    sc.close();
    }
}
