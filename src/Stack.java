public class Stack {
//head => top
//pop => delete first
//push =>Insert first
//first in last out
    private ListNode top;

    public Stack(){
        this.top = null;
    }

    public ListNode getTop(){
        return this.top;
    }

    public void push(int newValue){
        ListNode newNode = new ListNode(newValue);
        newNode.setNext(this.top);
        this.top = newNode;
    }

    public ListNode pop(){
        ListNode NodePtr;
        NodePtr = top;
        this.top = NodePtr.getNext();
        NodePtr.setNext(null);
        return NodePtr;
    }

    public void cetakStack(){
        ListNode NodePtr;
        NodePtr = this.top;

        while(NodePtr != null){
            System.out.println(NodePtr);
            NodePtr = NodePtr.getNext();
        }
    }
}
