import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultados = somaDigitos(numero);
        System.out.println("A somo de digitos do número " + numero + " é: " + resultados);
    }

    public static int somaDigitos(int numero){
        if (numero < 10){
            return numero;
        }
        return numero % 10 + somaDigitos(numero / 10);
    }

}
