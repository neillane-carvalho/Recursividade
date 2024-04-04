import java.util.Scanner;

public class SomaNumNaturais {
    public static int somaNaturais(int n){
        if (n == 1){
            return  1;
        }

        return n + somaNaturais(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <=0){
            System.out.println("O número fornecido deve ser psitivo!");
        } else {
            int soma = somaNaturais(n);
            System.out.println("A soma dos naturais de 1 até " + n + " é: " + soma);
        }
    }

}
