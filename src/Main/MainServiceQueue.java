package Main;

import DataStr.MyQueue;
import Student.Student;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Random;

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
        try{
            //stunda pieminejat, ka nevarat ar 2 for cikliem, tapec partaisiju, lidz galam nesanaca, nesaprotu kapec otrais thread nepalaizas.
            numberSimulation(3);
        }catch (Exception e){
            System.out.println(e);
        }

        try{

            System.out.println("----Call function-------");
            callFunction("f1","f2","f3");
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void numberSimulation(int numberCount) throws Exception {
        Random random = new Random();

        MyQueue<String> numbers = new MyQueue<>();


        //stunda pieminejat, ka nevarat ar 2 for cikliem, tapec partaisiju, lidz galam nesanaca, nesaprotu kapec otrais thread nepalaizas.

        Thread addThread = new Thread(() -> {
            int count = numberCount;
            while (count > 0) {
                try {
                    String number = numberCreator();
                    numbers.enqueue(number);
                    int start = LocalDateTime.now().getMinute();
                    System.out.println("Number " + number + " has been added to the queue at this time in minutes: " + start);
                    Thread.sleep(random.nextInt(1500));
                    count--;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });


        Thread removeThread = new Thread(() -> {
            while (!numbers.isEmpty()) {
                try {
                  numberRemover(numbers,numberCount);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });

        addThread.start();
        removeThread.start();


        addThread.join();
        removeThread.join();

    }





    public static void numberRemover( MyQueue<String> numbers,int numberCount) throws Exception {
        Random random = new Random();
        if(numbers.isEmpty()){
            throw new Exception("Empty queue");
        }
        int start = LocalDateTime.now().getMinute();
        String number = numbers.dequeue();
        Thread.sleep(random.nextInt(2000));
        System.out.println("Number removed from the queue: " + number + " at this time in minutes: " + start);



    }

    public static String numberCreator() throws Exception {

        Random random = new Random();

            int x = random.nextInt(900) + 100;
            int b = random.nextInt(900) + 100;
            int c = random.nextInt(90) + 10;
            String number = "+371 " + x + "-" + b + "-" + c;
            Thread.sleep(random.nextInt(3000));

            return number;
    }


    public static int f1() {
        return 1;
    }
    public static int f2() {
        return 2;
    }
    public static int f3() {
        return 3;
    }

    public static void callFunction(String name1, String name2, String name3) throws Exception {
        MyQueue<String> functionName = new MyQueue<>();

        functionName.enqueue(name1);
        functionName.enqueue(name2);
        functionName.enqueue(name3);




        for(int i = 0; i < 3; i++){
            String temp = functionName.dequeue();
            Method method = MainServiceQueue.class.getDeclaredMethod(temp);

            System.out.println( method.invoke(null));
        }

    }
}
