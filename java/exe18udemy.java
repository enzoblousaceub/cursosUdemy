import java.util.Scanner;

public class exe18udemy {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int contagem = 0;
        if (n<=0) {
            System.out.println("entre com um numero valido");
        }
        for(int i = 0;i<=n;i++){
            if (i%2==0) {
                System.out.println(i);
                contagem++;
            }
        }
        System.out.printf("%d",contagem);
        sc.close();
    }
}