public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

//konstruktor default
    public TreeNode(){
        this.value = 0;
        this.left = null;
        this.right = null;
    }
//konstruktor with value
    public TreeNode(int newValue){
        this.value = newValue;
        this.left = null;
        this.right = null;
    }
    
//Setter
    public void setValue(int newValue){
        this.value = newValue;
    }    

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

//Getter
    public int getValue(){
        return this.value;
    }    
    public TreeNode getLeft(){
        return left;
    }
    public TreeNode getRight(){
        return right;
    }
    
}
