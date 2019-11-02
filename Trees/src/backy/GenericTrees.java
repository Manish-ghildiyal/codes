package backy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTrees {
    private Node root;
    public void insert(Scanner s){
        System.out.println("enter the value of root node");
        int value=s.nextInt();
        this.root=new Node(value);
        insert(s,root);
    }

    public void insert(Scanner s, Node node) {
        while (true){
            System.out.println("do you want to enter child of  node"+node.value);
            boolean yes=s.nextBoolean();
            if(yes){
                System.out.println("enter the value");
                int value=s.nextInt();
                Node child=new Node(value);
                node.children.add(child);
                insert(s,child);
            }
            else break;
        }
    }
    public void display(){
        display(root,"");
            }

    private void display(Node node, String indent) {
        System.out.println(indent+node.value);
        for (int i = 0; i <node.children.size() ; i++) {
            display(node.children.get(i),indent+"\t");
        }
    }
    public int count()
    {
       return  count(root);
    }
    public int count(Node node){
        int c=1;
        for (int i = 0; i <node.children.size() ; i++) {
            c+= count(node.children.get(i));
        }
        return c;
    }
    public int max()
    {
        return max(root,root.value);
    }
    public int max(Node node,int m){
        if(m<node.value){
            m=node.value;
        }
        for (int i = 0; i <node.children.size() ; i++) {
            m=max(node.children.get(i),m);
        }
        return m;
    }
    public int height()
    {
        return height(root);
    }
    public int height(Node node){
        int maxheight=0;
        for (int i = 0; i <node.children.size() ; i++) {
            int height=height(node.children.get(i));
            maxheight=Math.max(maxheight,height);
        }
        return 1+maxheight;
    }
    public void depthKelements(int k){
        depthKelements(root,k);
    }
    public void depthKelements(Node node,int k){
        if(k==0){
            System.out.println(node.value);
            return;
        }
        for (int i = 0; i <node.children.size() ; i++) {
            depthKelements(node.children.get(i),k-1);
        }

    }
    public void postorder(){
        postorder(root,"");
    }

    private void postorder(Node node, String indent) {
      //  System.out.print(indent+node.value);
        for (int i = 0; i <node.children.size() ; i++) {
            postorder(node.children.get(i),indent=" ");
        }
        System.out.print(indent+node.value);
    }
    public void preorder(){
        preorder(root,"");
    }

    private void preorder(Node node, String indent) {
        System.out.print(indent+node.value);
        for (int i = 0; i <node.children.size() ; i++) {
            preorder(node.children.get(i),indent=" ");
        }
    }
    public void lo(){
        lo(root);
    }
    public void lo(Node node)
    {
        Queue<Node> q=new LinkedList<>();
       q.add(node);
       while (!q.isEmpty())
       {
           Node temp=q.remove();
           System.out.print(" "+temp.value);
           for (int i = 0; i <temp.children.size() ; i++) {
               q.add(temp.children.get(i));
           }
       }
    }

    public class Node {
        private int value;
        private ArrayList<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
