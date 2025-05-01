import java.util.Scanner;
public class exe27udemy {
    public static void main (String[] args){
/*fazer um programa para:
1)ler os lados de 2 triangulos (x e y)  
2)mostrar a area de ambos
3)mostrar qual area é maior de qual triangulo
formula area a partir de seus lados a, b e c area= raiz[p(p-a)*(p-b)*(p-c)] onde p = a+b+c/2*/
    Scanner sc = new Scanner(System.in);
    double xA = sc.nextDouble();
    double xB = sc.nextDouble();
    double xC = sc.nextDouble();
    double yA = sc.nextDouble();
    double yB = sc.nextDouble();
    double yC = sc.nextDouble();
    double area1 = calcularArea(xA, xB, xC);
    double area2 = calcularArea(yA, yB, yC);
            mostrarArea1(area1);
            mostrarArea2(area2);
            comparador(area1, area2);         
    sc.close();
    }
    public static double calcularArea(double a, double b, double c){
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return area;
    }
    public static void mostrarArea1(double valor){
        System.out.println("area1 : " +valor);
    }
    public static void mostrarArea2(double valor){
        System.out.println("area1 : " +valor);
    }
    public static double comparador(double areaX, double areaY){
        if (areaX > areaY) {
        System.out.println("Maior área: Triângulo 1");
    } else {
        System.out.println("Maior área: Triângulo 2");
    }
    return 0;
}
}
