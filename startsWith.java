public class startsWith {
    public static void main(String[] args) {
        String s = "Hello World";
         boolean b = s.startsWith("hel");
        System.out.println(b);

        boolean c = s.startsWith("hel",0);
        System.out.println(c);
    }
}
