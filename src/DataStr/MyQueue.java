package DataStr;

public class MyQueue<ttype> {

    protected MyNodeQ<ttype> frontNode;
    protected MyNodeQ<ttype> rearNode;
    protected int length;

    public MyQueue() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isFull(){
        try {
            MyNodeQ<ttype> newNode = new MyNodeQ<>(null);
            return false;
        } catch (OutOfMemoryError e) {
            return true;
        }
    }

    public boolean isEmpty() {
        return (length == 0);
    }
    public int HowManyElements(){
        return length;
    }

    public void enqueue(ttype element) throws Exception {

        if(isFull()){
            throw new Exception("Queue is full");
        }

        MyNodeQ<ttype> newNode = new MyNodeQ<>(element);

        if(isEmpty()){
            frontNode = newNode;
        } else{
            rearNode.setNext(newNode);
            newNode.setPrev(rearNode);
        }
        rearNode = newNode;
        length++;
    }

    public ttype dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        ttype temp = frontNode.getElement();
        frontNode = frontNode.getNext();

        if(frontNode == null){
            rearNode = null;
        }
        length--;
        return temp;

    }

    public void print()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        MyNodeQ<ttype> temp = frontNode;

        for(int i = 0; i < length; i++){
            System.out.println(temp.getElement());
            temp = temp.getNext();
        }
    }

    public void EmptyQ(){
        frontNode = null;
        rearNode = null;
        length = 0;
        System.gc();
    }


}
