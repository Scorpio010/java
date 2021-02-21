public class startsWith {
    public static void main(String[] args) {
        String s = "Hello World";
         boolean b = s.startsWith("Hel");
        System.out.println(b);

        boolean c = s.startsWith("Hel",0);
        System.out.println(c);

        boolean d =s.startsWith("Hel",1);
        System.out.println(d);
    }
}
