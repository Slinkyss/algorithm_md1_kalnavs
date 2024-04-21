package DataStr;

import java.sql.SQLOutput;

public class Mystackk<Ttype> {
    private MyNodeStack<Ttype> topNode;
    private int length;

    public Mystackk() {
        topNode = null;
        length = 0;
    }

    public boolean isFull() {
        try {
            MyNodeStack<Ttype> newNode = new MyNodeStack<>(null);
            return false;
        } catch (OutOfMemoryError e) {
            return true;
        }
    }

    public boolean isEmpty(){
        return (topNode == null);
    }

    public int HowManyElement(){
        return length;
    }

    public void push(Ttype element) {
        if(!isFull()){
            MyNodeStack<Ttype> newNode = new MyNodeStack<>(element);
            newNode.setNext(topNode);
            topNode = newNode;
            length++;
        }
        else{
            System.out.println("Stack is full");
        }
    }
    public Ttype pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }

        Ttype element = topNode.getElement();
        topNode = topNode.getNext();
        length--;
        return element;

    }

    public Ttype top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return topNode.getElement();
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        MyNodeStack<Ttype> newNode = topNode;
        for(int i = 0; i < length; i++){
            System.out.println(newNode.getElement());
            newNode = newNode.getNext();
        }
    }

    public void EmptyStack(){
        topNode = null;
        length = 0;
        System.gc();
    }


}
