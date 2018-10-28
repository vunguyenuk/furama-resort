import java.util.LinkedList;

public class Queue<T> {
    private LinkedList <T> items = new LinkedList <>();

    public void add(T item) {
        items.addLast(item);
    }

    public T remove() {
        System.out.println("Xoa data dau tien: ");
        return items.removeFirst();
    }

    public void printArray(){
        for(T element: items){
            System.out.println(element);
        }
        System.out.println();
    }
}