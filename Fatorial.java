public class Fatorial {
    public static void main(String[] args) {
        int x = 5;
        int resultado = calculafatorial(x);
        System.out.println("O fatorial de " + x + " é " + resultado );
    }

    public static int calculafatorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else {
            return n * calculafatorial(n-1);
        }
    }
}
