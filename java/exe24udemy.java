import java.util.Scanner;

public class exe24udemy {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Entre com 4 numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int soma = sum(a, b, c, d);
        numeroSomado(soma);
}
    public static int sum(int w, int x, int y, int z){
        int valor;
        valor = w+x+y+z;
        return(valor);
    }

    public static void numeroSomado(int result){
        System.out.println("Resultado: " +result);
    }
}
