import java.util.Scanner;
public class exe8udemy {
public static void main(String[] args){
    // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
    int num;
    Scanner sc = new Scanner(System.in);
        System.out.println("entre com um numero e veja se ele e par ou impar");
        num = sc.nextInt();
        if (num%2==0) {
            System.out.println("é par");
        }
        else{
            System.out.println("é impar");
        }


        sc.close();
    }
}
