package kpfu.homework.collection.Queue.Stack;

/**
 * Created by Tony on 20.02.2017.
 */
public class List<E> {

    private ListElement<E> head;
    private ListElement<E> tail;
    private int count = 0;


    public E getElement(int num) {
        ListElement<E> tmp = head;
        for (int i = 0; i < num && tmp.next != null; i++) {
            tmp = tmp.next;
        }
        return (tmp.data);
    }

    public void addFront(E data) {
        count++;
        ListElement<E> a = new ListElement<E>();
        a.data = data;
        if (head == null) {
            head = a;
            tail = a;

        }
        else {
            a.previous = null;
            a.next = head;
            head = a;
        }
    }
    public void addBack (E data) {
        count++;
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            a.previous = tail;
            tail.next = a;
            tail = a;
            tail.next = null;
        }
    }
     public void delEl(E data) {
         if (head == null) return;
         if (head == tail) {
             tail = null;
             head = null;
             return;
         }
         if (head.data == data) {
             head = head.next;
             return;
         }
         ListElement t = head;
         while (t.next != null) {
             if (t.next.data == data) {
                 if (tail == t.next) {
                     tail = t;

                 }
                 t.next = t.next.next;
                 return;
             }
             t = t.next;
         }
     }


    public void printList (){
        ListElement t = head;
        while (t != null) {
            System.out.println(t.data + " ");
            t = t.next;

        }
    }

    }


