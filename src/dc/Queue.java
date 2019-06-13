package dc;

import java.util.Iterator;

/**
 * Created by Vardan Aivazian
 * Date: 6/13/2019
 * Time: 4:08 PM
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int n;


    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        Node oldLast = this.last;
        this.last = new Node();
        last.next = null;
        last.item = item;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        ++n;
    }
    
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        --n;
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node {
        Node next;
        Item item;
    }
}
