public class Strings {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2.intern() == s3);
        System.out.println(s1.toUpperCase());
    }
}
