import org.w3c.dom.Node;

public class Linkedlist2 {
    private ListNode head;
    private ListNode tail;

    public Linkedlist2(){
        this.head = null;
        this.tail = null;
    }

    public ListNode getHead(){
        return this.head;
    }

    public ListNode getTail(){
        return this.tail;
    }

//Boolean isOneEl
    public boolean isOneEl(){
        if(this.head == this.tail)
        return true;
        else
        return false;
    }

//Append
    public void append(int newValue){
        ListNode newNode = new ListNode(newValue);

        if(this.head == null && this.tail == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.setNext(newNode);
            tail = newNode;
        }
    }

//Insert First
    public void insertFirst(int newValue){
        ListNode newNode = new ListNode(newValue);
        if(this.head == null && this.tail == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }
    
//Insert After

    public void insertAfter(int newValue, ListNode prevNode){
        if(prevNode == this.tail){
            append(newValue);
        }
        else{
            ListNode newNode = new ListNode(newValue);
            newNode.setNext(prevNode.getNext());
            prevNode.setNext(newNode);
        }
    }

//Delete First
    public ListNode delFirst(){
        if(this.head == this.tail)
            this.tail = null;
        
            ListNode NodePtr;
            NodePtr = this.head;
            this.head = NodePtr.getNext();
            NodePtr.setNext(null);

            return NodePtr;
    }
//Delete Last
    public ListNode delLast(){
        ListNode NodePtr;
        ListNode temp;

        if(isOneEl()){
            NodePtr = delFirst();
        }
        else{
            temp = this.head;
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            NodePtr = this.tail;
            this.tail = temp;
            this.tail.setNext(null);
        }

        return NodePtr;
    }

//Delete After
    public ListNode delAfter(ListNode prevNode){
        ListNode NodePtr;

        if(prevNode.getNext() == this.tail){
            NodePtr = delLast();
        }
        else{
            NodePtr = prevNode.getNext();
            prevNode.setNext(NodePtr.getNext());
            NodePtr.setNext(null);
        }
        return NodePtr;
    }    


//cetak 
    public void cetakList(){
        ListNode NodePtr;
        NodePtr = this.head;
        if(NodePtr == null){
            System.out.println("List Kosong");
        }
        while(NodePtr != null){
            System.out.println(NodePtr);
            NodePtr = NodePtr.getNext();
        }
    }    
}
