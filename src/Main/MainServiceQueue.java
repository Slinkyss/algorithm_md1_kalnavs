package Main;

import DataStr.MyQueue;
import Student.Student;

public class MainServiceQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myIntegerQ = new MyQueue<>();
        MyQueue<Student> myStudentQ = new MyQueue<>();

        int[] grades = {1,2,3,4,5,6,7,8,9};
        Student student = new Student("Janis","Kaja",grades);
        Student student2 = new Student("Jojo","Kaja",grades);
        Student student3 = new Student("toko","Maja",grades);


        try{
            System.out.println("----Added elements to integer queue-------");
            myIntegerQ.enqueue(1);
            myIntegerQ.enqueue(2);
            myIntegerQ.enqueue(3);
            myIntegerQ.enqueue(4);
            myIntegerQ.enqueue(5);
            myIntegerQ.print();
            System.out.println("----Dequed to integer queue-------");
            myIntegerQ.dequeue();
            myIntegerQ.print();
            System.out.println("----How many elements-------");
            System.out.println(myIntegerQ.HowManyElements());
            System.out.println("----Make empty function-------");
            myIntegerQ.EmptyQ();
            myIntegerQ.print();

        }catch (Exception e){
            System.out.println(e);
        }
        try{
            System.out.println("----Added elements to Student queue-------");
            myStudentQ.enqueue(student);
            myStudentQ.enqueue(student2);
            myStudentQ.enqueue(student3);
            myStudentQ.print();
            System.out.println("----Dequed to Student queue-------");
            myStudentQ.dequeue();
            myStudentQ.print();
            System.out.println("----How many elements-------");
            System.out.println(myStudentQ.HowManyElements());
            System.out.println("----Make empty function-------");
            myStudentQ.EmptyQ();
            myStudentQ.print();
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
