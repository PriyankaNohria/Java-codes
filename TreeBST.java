import java.util.*;
class BST
{
private Node root;

public void insert(int key)
{
root=insert(root,key);
}

private Node insert(Node n,int key)
{
if(n==null) new Node(key);
if(n.key>key) n.left=insert(n.left,key);
else if(n.key<key) n.right=insert(n.right,key);
else{}
return n;
}

public int height()
{
 if(root==null)
return 0;
return height1(root);
}

public int height1(Node root)
{
if(root==null)
return 0;
return 1+Math.max(height1(root.left),height1(root.right));
}


private class Node
{
private int key;
private Node left;
private Node right;

public Node(){}

public Node(int key)
{
this.key=key;
left=null;
right=null;
}
}
}
class TestBST{
public static void main(String ar[])
{
BST b=new BST();
b.insert(5);
b.insert(4);
b.insert(3);
b.insert(2);
b.insert(1);
b.insert(0);
System.out.println(b.height());
}
}