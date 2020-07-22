public class Variables {

    public static void main(String[] args) {
        // Tipos de dato primitivos
        byte variableByte = 10;
        char variableChar = 'A';
        short variableShort = 15;
        int variableInt = 20;
        long variableLong = 25;
        float variableFloat = 1.0f;
        double variableDouble = 1.0;
        boolean variableBoolean = true;

        System.out.println("---Tipos de dato primitivos---");
        System.out.println(variableByte);
        System.out.println(variableChar);
        System.out.println(variableShort);
        System.out.println(variableInt);
        System.out.println(variableLong);
        System.out.println(variableFloat);
        System.out.println(variableDouble);
        System.out.println(variableBoolean);

        // Tipo de dato por referencia
        System.out.println("---Tipos de dato por referencia---");
        String instrumento = "guitarra";
        System.out.println(instrumento);

        // Tipo de variable var
        System.out.println("---Tipos de dato var---");
        var edad = 20;
        var canal = "COF Academy";
        System.out.println(edad);
        System.out.println(canal);


    }

}
