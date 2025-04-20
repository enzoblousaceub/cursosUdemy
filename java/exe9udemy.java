import java.util.Scanner;
public class exe9udemy {
    public static void main(String args[]){
//  Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
// ordem crescente ou decrescente.
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("multiplos");
        }
        else{
            System.out.println("nao sao multiplos");
        }
        sc.close();
    }
}
