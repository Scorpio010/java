import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        list.add("李");
//        list.add("蕴");
//        list.add("昭");
//
//        System.out.println(list);
//          list.add("我");
//          list.add(1,"你");
//          list.add(2,"w");
//          list.add(2,"2");
//          list.add(3,"4");
//          list.add(4,"他");
//        System.out.println(list);//[我,你,2,4,他,w]
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//        list.add("F");
//        list.add("B");
//        list.remove(3);
//        System.out.println(list);//[A, B, C, E, F, B]
//        list.remove("B");//删除遇到的第一个该元素
//        System.out.println(list);//[A, C, E, F, B]
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
//        System.out.println(list.get(0));//A
//        System.out.println(list.set(0, "你"));//A
//        System.out.println(list.set(1, "我"));//B
//        System.out.println(list);//[你, 我, C, D, E, F]
        System.out.println(list.size());//6
        System.out.println(list.isEmpty());//false
        list.clear();//清空
        System.out.println(list.size());//0
        System.out.println(list.isEmpty());//true

    }
}
