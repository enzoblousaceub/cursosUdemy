import java.util.Scanner;
public class exe2udemy {
    public static void main(String[] args){
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
        double area, pi =  3.14159;
        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        area = pi * (r * r);
        System.out.println(area);
        sc.close(); 
    }
}
