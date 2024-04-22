package DataStr;


public class MyNodeD<Ttype> {

    private Ttype element;
    private MyNodeD<Ttype> next;
    private MyNodeD<Ttype> prev;

    public MyNodeD(Ttype element) {
        this.element = element;
    }
    public Ttype getElement() {
        return element;
    }
    public void setElement(Ttype element) {
        this.element = element;

    }
    public MyNodeD<Ttype> getNext() {
        return next;
    }
    public void setNext(MyNodeD<Ttype> next) {
        this.next = next;
    }
    public MyNodeD<Ttype> getPrev() {
        return prev;
    }
    public void setPrev(MyNodeD<Ttype> prev) {
        this.prev = prev;

    }

    @Override
    public String toString() {
        return element.toString();
    }
}
