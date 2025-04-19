import java.util.Scanner;

public class exe3udmey {
    public static void main(String args[]){
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        int a, b, c, d, dif;
        Scanner scanzin = new Scanner(System.in);
        a = scanzin.nextInt();
        b = scanzin.nextInt();
        c = scanzin.nextInt();
        d = scanzin.nextInt();
        dif = (a - b) * (c - d);

        System.out.println("DIFERENCA = "+dif);
        scanzin.close();
    }

}
