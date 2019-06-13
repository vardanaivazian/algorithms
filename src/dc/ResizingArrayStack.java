package dc;

import java.util.Iterator;

/**
 * Created by Vardan Aivazian
 * Date: 6/13/2019
 * Time: 12:40 PM
 */

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int n;

    public boolean isEmpty() {
        return n == 0;
    }
    
    public void resize(int max) {
        Item[] items = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            items[i] = a[i];
        }
        a = items;
    }
    
    public int size() {
        return n;
    }
    
    public void push(Item item) {
        if (a.length == n) resize(2*a.length);
        this.a[n++] = item; 
    }
    
    public Item pop() {
        Item item = a[--n];
        a[n] = null;
        if (n > 0 && n == a.length/4) {resize(a.length / 2);}
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n;
        
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
    }
}
