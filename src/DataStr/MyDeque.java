package DataStr;

public class MyDeque<Ttype> extends MyQueue<Ttype>{


    public void insertFront(Ttype element)throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        MyNodeQ<Ttype> newNode = new MyNodeQ<>(element);
        if(isEmpty()){
            rearNode = newNode;
        }else{
            newNode.setNext(frontNode);
            frontNode.setPrev(newNode);
        }

        frontNode = newNode;
        length++;

    }

    public void insertRear(Ttype element)throws Exception{
        enqueue(element);
    }

    public void removeFront()throws Exception{
        dequeue();
    }

    public void removeRear()throws Exception{

        if(isEmpty()){
                throw new Exception("Queue is empty");
        }

        rearNode = rearNode.getPrev();
        if(rearNode==null){
            frontNode = null;
        } else{
            rearNode.setNext(null);
        }
        length--;
        System.gc();
    }

    public void printReverse()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        MyNodeQ<Ttype> newNode = rearNode;
        for(int i = 0; i < length; i++){
            System.out.println(newNode.getElement());
            newNode = newNode.getPrev();
        }


    }
    public void makeEmpty()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        length = 0;
        frontNode = null;
        rearNode = null;
        System.gc();
    }


}
