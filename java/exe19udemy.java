import java.util.Scanner;
public class exe19udemy {
    public static void main(String args[]){
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int contagem = 0;
            for(int i = 0; i<=n; i++){
                if (i%2!=0) {
                    System.out.println(i);
                    contagem++;
                }
            }
System.out.println(contagem);
sc.close();
    }
}
