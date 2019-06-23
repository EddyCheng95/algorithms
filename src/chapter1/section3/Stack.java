package chapter1.section3;

import java.util.Iterator;

/**
 * 算法1.2
 * 下压栈的链表形式实现
 *
 * 重要
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item>{


    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
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

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("sad");
        s.push("sad1");
        s.push("sad2");
        s.push("sad3");
        s.push("sad4");
        s.push("sad5");

        System.out.println(s.pop());

        for (String str : s) {
            System.out.println(str);
        }

    }
}
