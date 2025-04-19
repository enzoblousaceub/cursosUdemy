import java.util.Locale;
import java.util.Scanner;

public class exe5udemy {
    public static void main (String args[]){
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
    int peca1, n1, peca2, n2;
    double v1, v2, preco1, preco2,valorTotal;
    Scanner sc = new Scanner(System.in);
    System.out.println("entre com seu numero da peca1");
    peca1=sc.nextInt();
    System.out.println("entre com a qtd1");
    n1=sc.nextInt();
    System.out.println("entre com o valor1");
    v1=sc.nextDouble();

    System.out.println("entre com seu numero da peca2");
    peca2=sc.nextInt();
    System.out.println("entre com a qtd2");
    n2=sc.nextInt();
    System.out.println("entre com o valor2");
    v2=sc.nextDouble();

    preco1 = v1 * n1;
    preco2 = v2 * n2;
    valorTotal = preco1 + preco2;
    System.out.printf("VALOR A PAGAR = %.2f", valorTotal);
    
    sc.close();
    }
}
