package datastructures.bst;

public class App {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);


        BinarySearchTree.Node node29 = bst.insert(29);
        BinarySearchTree.Node node98 = bst.insert(98);
        bst.insert(87);
        bst.insert(77);
        bst.insert(89);
        bst.insert(34);

        bst.traversalOrder().ifPresent(nodes ->
                nodes.forEach(node -> System.out.print(node.getData() + " "))
        );

        System.out.println("\nSuccessor of 98 is : " + bst.successor(node98));
        System.out.println("Successor of 29 is : " + bst.successor(node29));
        System.out.println("Successor of 50 is : " + bst.successor(bst.getRoot()));

    }



}
