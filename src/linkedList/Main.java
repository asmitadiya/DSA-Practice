package linkedList;

public class Main {

    static void main() {
        SinglyLL ll = new SinglyLL();
        ll.insertFirst(3);
        ll.insertFirst(5);
        ll.insertFirst(18);
        ll.insertFirst(20);
        ll.insertLast(19);
        ll.insertIndex(3,100);
        System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteLast());
        System.out.println(ll.delete(2));
        ll.display();

    }
}
