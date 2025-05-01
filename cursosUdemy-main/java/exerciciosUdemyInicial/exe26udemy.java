import java.util.Scanner;
public class exe26udemy {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int verificador = smallestNumber(num1, num2);
        showSmallest(verificador);

        input.close();
    }
    public static int smallestNumber(int x, int y){
        int smaller;
        if (x<y) {
           smaller = x;
        }
        else{
            smaller = y;
        }
        return(smaller);
    }
    public static void showSmallest(int result){
        System.out.println("O menor é: " +result);
    }
}
