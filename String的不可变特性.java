public class String的不可变特性 {
    public static void main(String[] args) {
//        String s = "Hello";
//        String t = "Hello";
//        System.out.println(s.equals(t));    //s和t对象是否相等
//        System.out.println(s == t);         //s和t是否指向同一个对象
        //java内部做优化了，由于String不可变，所以只要明确两个对象的值相等的情况下尽可能的让这些引用都指向一个对象，
        //可以有效减少空间的消耗


//          String s = "Hello";
//          String t = new String("Hello");
//        System.out.println(s.equals(t));//ture
//        System.out.println(s == t);//false
//        //因为明确用new了，所以java创建了一个新对象

    }

}
