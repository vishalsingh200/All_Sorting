import java.util.Scanner;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
static class Binry_tree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1)
                return null;
            Node new_node = new Node(nodes[index]);
            new_node.left = buildTree(nodes);
            new_node.right = buildTree(nodes);
            return new_node;
        }
}




    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,6,-1,-1};
        Binry_tree tree = new Binry_tree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}