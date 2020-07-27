public class Operadores {
    public static void main(String[] args) {
        /*
        OPERADORES ARITMETICOS
        + suma
        - resta
        * multiplicacion
        / division
        % modulo
         */
        System.out.println("OPERADORES ARITMETICOS");
        int num1 = 10;
        int num2 = 3;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


        /* OPERADORES RELACIONALES
        < menor que
        > mayor que
        <= menor o igual
        >= mayor o igual
        == igualdad o equals
        != diferente
        */
        System.out.println("OPERADORES RELACIONALES");
        int num3 = 10;
        int num4 = 5;
        System.out.println(num3 <= num4);


        /* OPERADORES LOGICOS
        && and
        || or
        !  negacion
        */
        System.out.println("OPERADORES LOGICOS");
        boolean a = true;
        boolean b = false;
        System.out.println(a || b);
        System.out.println(!false);

    }
}
