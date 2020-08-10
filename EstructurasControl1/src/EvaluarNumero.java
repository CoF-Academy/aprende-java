import java.util.Scanner;

public class EvaluarNumero {
    public static void main(String[] args) {
        /**
         * Recibir un número entero y decir si es par o impar
         *      4 % 2 -> 0
         *      5 % 2 -> 1
         */
        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int residuo = num % 2;

        System.out.println("--- Controlando el flujo con la estructura if-else ---");
        if(residuo == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        System.out.println("--- Controlando el flujo con el operador ternario ---");
        String resultado = (residuo == 0) ? "El numero es par" : "El numero es impar";
        System.out.println(resultado);
    }
}
