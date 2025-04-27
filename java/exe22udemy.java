import java.util.Scanner;
public class exe22udemy {

    public static void main (String[] args){
//          Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//          segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
            Scanner input = new Scanner (System.in);
            int n = input.nextInt();
                for(int i = 0; i<=n; i++){
                    System.out.println("Entre com o numero1");
                    double leitor1 = input.nextDouble();
                    System.out.println("Entre com o numero2");
                    double leitor2 = input.nextDouble();
                if (leitor2==0) {
                    System.out.println("divisao impossivel");
                }
                else{
                    double divisao = leitor1 / leitor2;
                    System.out.println("Resultado: " +divisao);
                }
                }
        input.close();
    }
}