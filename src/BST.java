import java.util.Scanner;

public class BST {
    BST left,right;
    int data;
    BST(int data){
        this.data=data;
        left=right=null;
    }
}

class SolutionBST {
    public static int getHeight(BST root){
        if (root == null) {
            return -1;
        }
        else {
            return Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
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
        int height=getHeight(root);
        System.out.println(height);
    }
}