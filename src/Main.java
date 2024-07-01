
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(18);
        list.insert(53);
        list.insertAtStart(3);
        list.insertAt(1, 4);
        list.insertAt(5, 10);
        list.deleteAt(3);
        list.show();
    }
}