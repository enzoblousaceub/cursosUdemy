import java.util.Scanner;

public class exe1udemy {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        int a, b, soma;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        soma = a + b;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}