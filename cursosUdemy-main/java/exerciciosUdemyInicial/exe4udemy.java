import java.util.Locale;
import java.util.Scanner;

public class exe4udemy {
    
    public static void main (String args[]){
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        int id, time;
        double salario,value;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Olá! Entre com seu id da empresa!");
        id = sc.nextInt();
        time = sc.nextInt();
        value = sc.nextDouble();

        salario = (double)time * value;

        System.out.printf("NUMBER = %d%n",id);
        System.out.printf("SALARY = U$%.2f", salario);

        sc.close();
    }
}
