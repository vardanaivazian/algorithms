package dc;

import java.util.Iterator;

/**
 * Created by Vardan Aivazian
 * Date: 6/13/2019
 * Time: 12:59 PM
 */
public class Stack<Item> implements Iterable<Item> {
    
    private Node first;
    private int n;
    
    private class Node {
        Item item;
        Node next;
    }
    
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public int size() {
        return n;
    }
    
    public void push(Item item) {
        Node oldFirst = this.first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        ++n;
    }
    
    public Item pop() {
        Item item = first.item;
        first = first.next;
        --n;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    
    public class ListIterator implements Iterator<Item> {
        
        private Node current = first;
        
        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
    
    
}
