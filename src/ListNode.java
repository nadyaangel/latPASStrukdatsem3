public class ListNode {
    private int value;
    private ListNode next;


//Konstruktor default    
    public ListNode(){
        this.value = 0;
        this.next = null;
    }

//Konstruktor with value
    public ListNode(int newValue){
        this.value = newValue;
        this.next = null;
    }
//Setter

    public void setValue(int newValue){
        this.value = newValue;
    }
    public void setNext(ListNode newNext){
        this.next = newNext;
    }

//Getter

    public int getValue(){
        return this.value;
    }
    public ListNode getNext(){
        return this.next;
    }

//Buat cetak
    public String toString(){
        return ("List = " + this.value);
    }    



}
