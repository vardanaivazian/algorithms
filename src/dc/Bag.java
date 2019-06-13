package dc;

import java.util.Iterator;

/**
 * Created by Vardan Aivazian
 * Date: 6/13/2019
 * Time: 4:33 PM
 */
public class Bag<Item> implements Iterable<Item> {

    private Node first;
    private int n;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
    public void add(Item item) {
        Node oldFirst = this.first;
        this.first = new Node();
        this.first.item = item;
        this.first.next = oldFirst;
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Node next;
        Item item;
    }
}
