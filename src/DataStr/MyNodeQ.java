package DataStr;

public class MyNodeQ<Ttype> {

    private Ttype element;
    private MyNodeQ<Ttype> next;
    private MyNodeQ<Ttype> prev;

    public MyNodeQ(Ttype element) {
        this.element = element;
    }

    public Ttype getElement() {
        return element;
    }

    public void setElement(Ttype element) {
        this.element = element;
    }

    public MyNodeQ<Ttype> getNext() {
        return next;
    }
    public void setNext(MyNodeQ<Ttype> next) {
        this.next = next;
    }
    public MyNodeQ<Ttype> getPrev() {
        return prev;
    }
    public void setPrev(MyNodeQ<Ttype> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return this.element.toString();
    }
}
