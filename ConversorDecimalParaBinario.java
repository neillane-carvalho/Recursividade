public class ConversorDecimalParaBinario {
    public static void main(String[] args) {
        int decimal = 13;
        String binario = decimalParaBinario(decimal);
        System.out.println("O número " + decimal + " em binário é: " + binario);
    }

    public static String decimalParaBinario(int numero){
        if (numero == 0){
            return "0";
        }
        if (numero == 1){
            return "1";
        }
        return decimalParaBinario(numero / 2) + (numero % 2);
    }
}
