package com.chaitu;

import java.util.Scanner;
import java.util.Stack;

public class BinaryTrees {
    Node node;

    public BinaryTrees(Node node) {
        this.node = node;
    }

    public BinaryTrees() {
    }

    private static void preOrder(Node node) {


            if (node == null) {
                return;
            }
            System.out.printf("%s ", node.data);
            preOrder(node.left);
            preOrder(node.right);

        /*Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node!=null || !stack.empty()) {
            if(node==null){
                node = stack.pop().right;
            }
            System.out.println(node.data);
            if (node.left != null) {
                stack.push(node);
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else if (!stack.empty()) {
                node = stack.pop().right;
            }
            else {
                node = node.right;
            }
        }*/

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        System.out.println(root);
        preOrder(root);


    }

    @Override
    public String toString() {
        return "BinaryTrees{" +
                "node=" + node +
                '}';
    }

}
