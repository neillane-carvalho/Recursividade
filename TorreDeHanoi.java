public class TorreDeHanoi {
    public static void torreDeHanoi(int n, char origem, char destino, char auxiliar){
        if (n == 1){
            System.out.println("Mover disco " + n + " da torre " + origem + " para a torre " + destino);
                return;
        }

        torreDeHanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " da torre " + origem + " para a torre " + destino);
        torreDeHanoi(n - 1, auxiliar, destino, origem);

    }

    public static void main(String[] args) {
        int numeroDiscos = 3;
        char torreOrigem = 'A';
        char torreDestino = 'C';
        char torreAuxiliar = 'B';

        System.out.println("Movimentos para resolver as Torres de Hanoi com " + numeroDiscos + " discos:");
        torreDeHanoi(numeroDiscos, torreOrigem, torreDestino, torreAuxiliar);
    }
}
