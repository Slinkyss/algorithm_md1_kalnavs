package Main;

import DataStr.MyDeque;
import DataStr.Mystackk;
import Student.Student;

public class MainServiceDeque {
    public static void main(String[] args) {

        MyDeque<Integer> myIntegerD = new MyDeque<>();
        MyDeque<Student> myStudentD = new MyDeque<>();

        int[] grades = {1,2,3,4,5,6,7,8,9};
        Student student = new Student("Janis","Kaja",grades);
        Student student2 = new Student("Jojo","Kaja",grades);
        Student student3 = new Student("toko","Maja",grades);
        Student student4 = new Student("oto","moto",grades);
        Student student5 = new Student("mojo","jojo",grades);

        try{
            System.out.println("----Added elements to integer Deque front-------");
            myIntegerD.insertFront(1);
            myIntegerD.insertFront(2);
            myIntegerD.insertFront(3);
            myIntegerD.print();
            System.out.println("----Added elements to integer Deque rear-------");
            myIntegerD.insertRear(4);
            myIntegerD.insertRear(5);
            myIntegerD.insertRear(6);
            myIntegerD.print();
            System.out.println("----removing from rear------");
            myIntegerD.removeRear();
            myIntegerD.print();
            System.out.println("----removing from front------");
            myIntegerD.removeFront();
            myIntegerD.print();
            System.out.println("----printing elements from rear------");
            myIntegerD.printReverse();
            System.out.println("----Making deque empty------");
            myStudentD.isEmpty();

        }catch (Exception e){
            System.out.println(e);
        }

        try{
            System.out.println("----Added students from front-------");
            myStudentD.insertFront(student);
            myStudentD.insertFront(student2);
            myStudentD.insertFront(student3);
            myStudentD.print();
            System.out.println("----Added students from rear-------");
            myStudentD.insertRear(student4);
            myStudentD.insertRear(student5);
            myStudentD.print();
            System.out.println("----Remove students from rear-------");
            myStudentD.removeRear();
            myStudentD.print();
            System.out.println("----Remove students from front-------");
            myStudentD.removeFront();
            myStudentD.print();
            System.out.println("----printing elements from rear------");
            myStudentD.printReverse();
            System.out.println("----Making deque empty------");
            myStudentD.isEmpty();


        }catch (Exception e){
            System.out.println(e);
        }

    }




}
