public class StudentTest {
    public static void main(String[] args) {
        //构造对象，并且得到a引用，用于以后操作对象
        Student a = new Student();
        a.name = "lyz";
        a.age = 19;
        a.courseArray = new String[]= {"JavaSE","数据结构"};
        a.自我介绍();//通过a引用，调用属于该对象的方法
    }
}
