package DataStr;

public class MyNodeStack<Ttype>{

    private Ttype element;
    private MyNodeStack<Ttype> next;

    public MyNodeStack(Ttype element) {
        if(element == null){
            this.element = (Ttype)new Object();
        }else{
            this.element = element;
        }
    }

    public Ttype getElement() {
        return element;
    }

    public void setElement(Ttype element) {
        if(element != null){
            this.element = element;
        }else{
            this.element = (Ttype)new Object();
        }
    }

    public MyNodeStack<Ttype> getNext() {
        return next;
    }

    public void setNext(MyNodeStack<Ttype> next) {
        this.next = next;
    }

    @Override
    public String toString() {
       return element.toString();
    }
}
