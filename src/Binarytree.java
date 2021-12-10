public class Binarytree {
    private TreeNode root;

    public Binarytree(){
        this.root = null;
    }
    public TreeNode getRoot(){
        return root;
    }
//Append
    public void append(int newValue){
        this.root = insertTree(newValue, root);
    }
//insertTree
    public TreeNode insertTree(int newValue, TreeNode refNode){
        if(refNode == null){
            TreeNode newNode = new TreeNode(newValue);
            refNode = newNode;
        }
        else if(newValue >= refNode.getValue()){
            refNode.setRight(insertTree(newValue, refNode.getRight()));
        }
        else{
            refNode.setLeft(insertTree(newValue, refNode.getLeft()));
        }
        return refNode;
    } 

//pre Order
    public void preOrder(TreeNode refNode){
        if(refNode != null){
            System.out.print(refNode.getValue() + " ");
            preOrder(refNode.getLeft());
            preOrder(refNode.getRight());
        }
    }
//Cetak pre Order
    public void cetakPreOrder(){
        System.out.print("Pre Order : " );
        preOrder(this.root);
        System.out.println();
    }
    
//In Order
    public void inOrder(TreeNode refNode){
        if(refNode != null){
            inOrder(refNode.getLeft());
            System.out.print(refNode.getValue() + " ");
            inOrder(refNode.getRight());
        }
    }

//Cetak In Order
    public void cetakInOrder(){
        System.out.print("In Order : ");
        inOrder(this.root);
        System.out.println();
    } 

//Post Order
    public void postOrder(TreeNode refNode){
        if(refNode != null){
            postOrder(refNode.getLeft());
            postOrder(refNode.getRight());
            System.out.print(refNode.getValue());
        }
    }

//Cetak Post Order
    public void cetakPostOrder(){
        System.out.print("Post Order : ");
        postOrder(this.root);
        System.out.println();
    }    
    
}
