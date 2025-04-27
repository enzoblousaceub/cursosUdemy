import java.util.Scanner;

public class exe15udemy {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        String dia;    
    
        switch(x){
        case 1:
            dia = "domingo";
            break;
        case 2:
            dia = "segunda";
            break;
        default:
            dia = "outro";
            break;
        }
        System.out.println(dia);
        input.close();
    }
}
