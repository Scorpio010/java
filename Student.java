public class Student {
    public String name;
    public int age;
    public String[] courseArray;
    //在类中定义 普通方法
    public void 自我介绍(){
        //在方法中可以直接使用属性
        //name 读取该对象中，属性name的值
        System.out.printf("我叫%s,今年%d岁，我学习以下课程:\n",name,age);
        if(courseArray != null){
            for(String course: courseArray){
                System.out.println(course);
            }
        }
    }

}
