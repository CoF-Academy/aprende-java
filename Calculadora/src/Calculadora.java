import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** CALCULADORA ***");
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextFloat();
        System.out.println("Seleccione la operacion: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                // suma
                float suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                // resta
                float resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                // mult
                float mult = num1 * num2;
                System.out.println("El resultado es: " + mult);
                break;
            case 4:
                // div
                if (num2 == 0) {
                    System.out.println("No es posible dividir entre cero");
                } else {
                    float div = num1 / num2;
                    System.out.println("El resultado es: " + div);
                }
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}
