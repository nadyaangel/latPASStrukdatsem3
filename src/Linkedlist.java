public class Linkedlist {
    private ListNode head;
   
//Konstruktor default    
    public Linkedlist(){
        this.head = null;
    }

//konstruktor with value
    // public Linkedlist(ListNode newHead){

    // }   
    
//Getter
    public ListNode getHead(){
        return this.head;
    }
//Boolean isOneEl
    public boolean isOneEl(){
        return this.head.getNext() == null;
    }
//Boolean isEmpty
    public boolean isEmpty(){
        return this.head == null;
    }    

//Append
    public void append(int newValue){
        ListNode newNode = new ListNode(newValue);
        ListNode NodePtr;

        if(this.head == null){
            this.head = newNode;
        }
        else{
            NodePtr = this.head;
            while(NodePtr.getNext() != null){
                NodePtr = NodePtr.getNext(); 
            }
            NodePtr.setNext(newNode);
        }
    }
    
//Insert First
    public void insertFirst(int newValue){
        ListNode newNode = new ListNode(newValue);
        newNode.setNext(this.head);
        this.head = newNode;
    }

//Insert After
    public void insertAfter(int newValue, ListNode prevNode){
        ListNode newNode = new ListNode(newValue);
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
    } 

//Insert Last
    public void insertLast(int newValue){
        ListNode newNode = new ListNode(newValue);
        ListNode NodePtr;
        if(isEmpty() == true){
            this.head = newNode;
        }
        else{
            NodePtr = this.head;
            while(NodePtr.getNext() != null){
                NodePtr = NodePtr.getNext();
            }
            NodePtr.setNext(newNode);
        }
    }    
    
//Delete First
    public ListNode delFirst(){
        ListNode NodePtr;
        NodePtr = this.head;
        NodePtr.setNext(null);

        return NodePtr;
    }
//Delete After
    public ListNode delAfter(ListNode prevNode){
        ListNode NodePtr;
        NodePtr = prevNode.getNext();
        prevNode.setNext(NodePtr.getNext());
        NodePtr.setNext(null);
        return NodePtr;
    } 
    
//Delete Last
    public ListNode delLast(){
        ListNode NodePtr;
        ListNode temp;

        if(isOneEl() == true){
            NodePtr = delFirst();
        }
        else{
            temp = this.head;
            while(temp.getNext().getNext() != null){
                temp = temp.getNext();
            }
            NodePtr = temp.getNext();
            temp.setNext(null);
        }
        return NodePtr;
    }
    
    public void cetakList(){
        ListNode NodePtr;
        NodePtr = this.head;
        while(NodePtr != null){
            System.out.println(NodePtr);
            NodePtr = NodePtr.getNext();
        }
    }
}
