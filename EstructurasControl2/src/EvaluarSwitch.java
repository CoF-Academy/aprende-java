import java.util.Scanner;

public class EvaluarSwitch {
    public static void main(String[] args) {
        /**
         * Recibir un número y decir que dia de la semana es
         *      1 -> Domingo
         *      2 -> Lunes
         *      etc ...
         */
        System.out.println("Ingrese un numero entre 1 y 7");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("El dia es Domingo");
                break;
            case 2:
                System.out.println("El dia es Lunes");
                break;
            case 3:
                System.out.println("EL dia es Martes");
                break;
            case 4:
                System.out.println("El dia es Miercoles");
                break;
            case 5:
                System.out.println("El dia es Jueves");
                break;
            case 6:
                System.out.println("El dia es Viernes");
                break;
            case 7:
                System.out.println("El dia es Sabado");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
                break;
        }
    }
}
