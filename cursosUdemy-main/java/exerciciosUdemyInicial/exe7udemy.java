import java.util.Scanner;

public class exe7udemy {
    public static void main(String args[]){
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("digite um numero");
    num = sc.nextInt();
    if (num >= 0) {
        System.out.println("positivo");
        
    }
    else{
        System.out.println("negativo");
    }
    sc.close();
    }
     
}