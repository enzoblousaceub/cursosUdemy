import java.util.Scanner;

public class exe16udemy {
    public static void main(String args[]){
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
Scanner input = new Scanner (System.in);
int senha = 12345;
int senhaUser = input.nextInt();
        while (senhaUser!=senha) {
            System.out.println("tente novamente");
            senhaUser = input.nextInt();
        }
        System.out.println("senha correta");


input.close();
    }
}
