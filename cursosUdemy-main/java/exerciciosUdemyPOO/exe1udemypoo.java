import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class exe1udemypoo{
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

Triangle x, y; 
x = new Triangle();
y = new Triangle(); 
System.out.println("Enter the measures of triangle X: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double areaX = x.area();
double areaY = y.area();

System.out.printf("Triangle X area: %.4f%n", areaX);
System.out.printf("Triangle Y area: %.4f%n", areaY);

showBigger(areaX, areaY);
sc.close();
}
public static void showBigger(double area1, double area2){
    if (area1 > area2) {
        System.out.println("Larger area: X");
        }
        else {
        System.out.println("Larger area: Y");
        } 
        
}
}