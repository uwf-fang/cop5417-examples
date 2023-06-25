public class Driver {

    public static void main(String[] args) {
        LinkedListOfInt ll = new LinkedListOfInt();
        ll.addFirst(10);
        ll.addLast(1000);
        System.out.println(ll + " size: " + ll.size());  // size 2
        ll.insertBefore(0, 0);
        ll.insertAfter(20, 1);
        System.out.println(ll + " size: " + ll.size()); // size 4
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll + " size: " + ll.size()); // size 2
        ll.remove(1);
        System.out.println(ll + " size: " + ll.size()); // size 1
    }
}
