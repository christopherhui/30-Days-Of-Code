import java.util.*;

public class day23bfs {
    static void levelOrder(BST root){
        Queue<BST> queue = new LinkedList<BST>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            BST curr = queue.remove();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }
    public static BST insert(BST root,int data){
        if(root==null){
            return new BST(data);
        }
        else{
            BST cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BST root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

