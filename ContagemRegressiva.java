public class ContagemRegressiva {
    public static void contagemRegressiva(int n){
        if (n == 0){
            return;
        }

        System.out.println(n + " ");
        contagemRegressiva(n - 1);
    }

    public static void main(String[] args) {
        int numeroInicial = 5;
        System.out.println("Contagem regressiva a partir de " + numeroInicial + ":");
        contagemRegressiva(numeroInicial);
    }
}
