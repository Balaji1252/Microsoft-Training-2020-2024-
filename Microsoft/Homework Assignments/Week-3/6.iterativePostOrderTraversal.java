import java.util.ArrayList;
import java.util.Stack;

// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer>postOrder(Node node){
    ArrayList<Integer>list=new ArrayList<>();
    Stack<Node>stack=new Stack<>();
    stack.push(node);
    while(!stack.isEmpty()){
        Node cur=stack.pop();
        list.add(0,cur.data);
        if(cur.left!=null){
            stack.push(cur.left);
        }
        if(cur.right!=null){
            stack.push(cur.right);
        }
    }
    return  list;
   }
}
