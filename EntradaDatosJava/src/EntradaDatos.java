import javax.swing.*;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // Entrada de datos por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese numero: ");
        int b = scanner.nextInt();
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);

        // Entrada de datos por JOptionPane
        // Solicitar datos
        String strNum1 = JOptionPane.showInputDialog("Ingrese numero: ");
        String strNum2 = JOptionPane.showInputDialog("Ingrese numero: ");
        // Parsear de String a int
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 + num2;
        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);

    }
}
