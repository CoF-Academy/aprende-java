public class Arreglos {
    public static void main(String[] args) {
        // Creacion de arreglo forma 1
        /*int [] numeros = new int[10];
        numeros[0] = 50;
        System.out.println(numeros[0]);*/

        // Creacion de arreglo forma 2
        /*int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros[9]);
        numeros[9] = 30;
        System.out.println(numeros[9]);
        int longitud = numeros.length;
        System.out.println(longitud);*/

        // ArrayIndexOutOfBoundsException
        /*int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros[9]);
        System.out.println(numeros[10]);*/

        // Copia de arreglos
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int [] copia;
        copia = numeros.clone();
        System.out.println(numeros[5]);
        System.out.println(copia[5]);


    }
}
