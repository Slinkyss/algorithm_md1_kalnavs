package Main;


import DataStr.Mystackk;
import Student.Student;

public class MainService {
    public static void main(String[] args) {
        Mystackk<Integer> myIntegerStack = new Mystackk<>();
        Mystackk<Student> myStudentStack = new Mystackk<>();

        int[] grades = {1,2,3,4,5,6,7,8,9};
        Student student = new Student("Janis","Kaja",grades);
        Student student2 = new Student("Jojo","Kaja",grades);
        Student student3 = new Student("toko","Maja",grades);

        try {


            System.out.println("----Added elements to integer stack-------");
            myIntegerStack.push(1);
            myIntegerStack.push(2);
            myIntegerStack.push(3);
            myIntegerStack.push(4);
            myIntegerStack.push(5);
            myIntegerStack.print();
            System.out.println("----Used pop function-------");
            int x = myIntegerStack.pop();
            System.out.println(x);
            System.out.println("----Printed after pop function------");
            myIntegerStack.print();
            System.out.println("----Used Top function-------");
            int y = myIntegerStack.top();
            System.out.println(y);
            System.out.println("----Printed after top function------");
            myIntegerStack.print();
            System.out.println("----Clearing mystack------");
            myIntegerStack.EmptyStack();
            myIntegerStack.print();
            System.out.println("----Added elements to student stack-------");
            myStudentStack.push(student);
            myStudentStack.push(student2);
            myStudentStack.push(student3);
            myStudentStack.print();
            System.out.println("----Used pop function-------");
            Student temp = myStudentStack.pop();
            System.out.println(temp);
            System.out.println("----Printed after pop function------");
            myStudentStack.print();
            System.out.println("----Used Top function-------");
            temp = myStudentStack.top();
            System.out.println(temp);
            System.out.println("----Printed after top function------");
            myStudentStack.print();
            System.out.println("----Clearing student stack------");
            myStudentStack.EmptyStack();
            myStudentStack.print();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
