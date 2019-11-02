package backy;

import java.util.Scanner;

public class BinaryTrees<T> {
    public Node root;
    public void insert(Scanner s){
        this.root=insert(root,s);
    }

    public Node insert(Node node, Scanner s) {
        if(node==null){
            System.out.println("enter new node value");
            int value=Integer.parseInt(s.nextLine());
            return new Node(value);
        }
        System.out.println("enter direction ");
        String dir=s.nextLine();
        if(dir.equals("left"))
            node.left=insert(node.left,s);
        else
            node.right=insert(node.right,s);
        return node;
    }
    public void disp( ){
        disp(root,"");
    }

    private void disp(Node node, String indent) {
        if(node==null)
            return;
        System.out.print(" "+indent+node.value);
        disp(node.left,indent);
        disp(node.right,indent);
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
    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node==null)
            return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
    public boolean find(int k){
        return find(k,root);
    }

    private boolean find(int k, Node node) {

        if(node==null)
            return false;
        if(node.value==k)
            return true;
        //System.out.println(node.value);
         find(k,node.left);
        return find(k,node.right);

    }
    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node) {
        if(node==null)
            return 0;
        int curr=1+height(node.left)+height(node.right);
        int max=Math.max(diameter(node.left),diameter(node.right));
        return Math.max(curr,max);
    }
    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {
        if(node==null)
            return;
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }

    public class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(int value) {
            this.value=value;
        }
    }
}
