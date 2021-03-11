package com.liyunzhao.learn_extends.example;


    public class Teacher extends Person{
        public String name = "teacher";

        public void printWithoutName(){
            System.out.println(name);//teacher
            System.out.println(this.name);//teacher
            System.out.println(super.name);//person
        }

        public void print(String name){
            System.out.println(name);//实参的值,这里是local
            System.out.println(this.name);//teacher
            System.out.println(super.name);//person
        }

        public static void main(String[] args) {
            Teacher t = new Teacher();

            t.printWithoutName();
            t.print("local");

        }
    }

