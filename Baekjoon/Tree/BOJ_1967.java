package Tree;
import java.util.*;

public class BOJ_1967 {
    static int answer = 0;
    static class Node{
        int root;
        int value;
        Node left;
        Node right;

        public Node(int root, int value){
            this.root = root;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static void printNode(Node node){
//        System.out.println(head.value);
//        System.out.println(node.root);

        if (node.left != null){
            printNode(node.left);
        }

        if (node.right!= null){
            printNode(node.right);
        }
    }


    static int solution(Node node){
        int leftMax = 0;
        int rightMax = 0;

        if (node.left == null && node.right == null){
            return node.value;
        }

        if (node.left != null) {
            leftMax = solution(node.left);
        }
        if (node.right != null){
            rightMax = solution(node.right);
        }

        answer = Math.max(answer,leftMax + rightMax);
//        System.out.println(node.root + " " + node.value+ " " +leftMax + " "+ rightMax);
//        System.out.println("maxheight : "+ (leftMax + rightMax));
        return Math.max(leftMax,rightMax) + node.value;


    }
    static void insertNode(Node node,int my, int child, int value){
//        System.out.println(node.root);
//        System.out.println(my + " " + child + " " + value);
        if (node.root == my){
            if (node.left == null){
                node.left = new Node(child,value);
            }else if (node.right == null){
                node.right = new Node(child,value);
            }
        }else{
            if (node.left != null){
                insertNode(node.left,my,child,value);
            }

            if (node.right != null){
                insertNode(node.right,my,child,value);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Node head = new Node(1,0);
        for (int i = 0 ; i < N-1 ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            insertNode(head,a,b,c);
        }
        solution(head);
        System.out.println(answer);
//        printNode(head);

    }
}
