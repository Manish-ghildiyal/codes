package backy;

public class BST<T extends Comparable<T>> {
    private Node root;
    public void insert(T value){
        insert(value,root);
    }
    public Node insert(T value,Node node){
        if(node==null)
            return new Node(value);
        if(value.compareTo(node.value)<0)
            node.left=insert(value,node.left);
        else
            node.right=insert(value,node.right);
        return node;
    }
    public void display( ){
        display(root,"");
    }

    private void display(Node node, String indent) {
        if(node==null)
            return;
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public class Node{
     private    Node right;
      private Node left;
       private T value;

        public Node(T value) {
            this.value=value;
        }
    }
}
