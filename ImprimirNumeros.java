public class ImprimirNumeros {
    public  static void imprimir(int n){
        if (n == 1){
            System.out.println(n + " ");
            return;
        }

        imprimir(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Números inteiros de 1 a " + n + ":");
        imprimir(n);
    }
}
