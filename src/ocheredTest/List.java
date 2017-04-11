package ocheredTest;

/**
 * Created by Tony on 20.03.2017.
 */
public class List {
    private int data;
    private List list;
    private List head;
    private List tail;
    private List next;


    public List(int data) {
        this.data = data;
    }

    public void add(int data){
        List node = new List(data);

        if (head == null){
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            tail = node;
        }

    }

    public void remove(int value){

    }




}
