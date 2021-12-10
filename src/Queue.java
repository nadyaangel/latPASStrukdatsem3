public class Queue {
//first in first out  
//enqueue == append (insert last)
//dequeue == delete first

    private ListNode head;
    private ListNode tail;

    public Queue(){
        this.head = null;
        this.tail = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    public ListNode getTail(){
        return this.tail;
    }

    public void enqueue(int newValue){
        ListNode newNode = new ListNode(newValue);
        if(this.head == null && this.tail == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.setNext(newNode);
            tail = newNode;
        }
    }

    public ListNode dequeue(){
        if(this.head == this.tail)
            this.tail = null;
        
        ListNode NodePtr;
        NodePtr = this.head;
        this.head = NodePtr.getNext();
        NodePtr.setNext(null);
        
        return NodePtr;
    }
}
