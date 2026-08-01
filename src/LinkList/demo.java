package LinkList;

import java.util.LinkedList;

public class demo {
    static void main() {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.reversed();
        System.out.println(ll.reversed().getLast());
    }
}
