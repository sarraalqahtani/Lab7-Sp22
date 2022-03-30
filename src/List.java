public class List <T> {
    protected class Node {
        T value; // object in node
        Node prev; // prev Node in list
        Node next; // next Node in list

        // default constructor
        protected Node() {
            value = null;
            prev = null;
            next = null;
        }
        // constructor
        protected Node(T v, Node p, Node n) {
            value = v;
            prev = p;
            next = n;
        }
    }
    protected Node head; // first node in list

    // default constructor
    List() {
        head = null;
    }

    public void print() {
        Node runner = head; // start at the head
        while (runner != null) { // keep going until the end
            System.out.println(runner.value); // print
            runner = runner.next; // go to next node
        }
    }

    // return whether  list is empty or not
    public boolean empty() {
        return (head == null); // whether head references null (i.e., empty list)
    }

}
