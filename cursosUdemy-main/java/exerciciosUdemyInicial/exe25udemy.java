import java.util.Scanner;
public class exe25udemy {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maiorOuIgual = greaterOrEqual(num1, num2);
        showGreater(maiorOuIgual);
        sc.close();
    }
    public static int greaterOrEqual(int a, int b){
        int num;
        if (a>b) {
            num = a;
        }
        else{
            num = b;
        }
        return(num);
    }
    public static void showGreater(int resultado){
        System.out.println("maior é: " +resultado);
    }
}
