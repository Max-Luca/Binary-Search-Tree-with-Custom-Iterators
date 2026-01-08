public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new StudentRecord("Maria", "Ross", "CS", 4));
        bst.insert(new StudentRecord("Laura", "Welkin", "ME", 2));
        bst.insert(new StudentRecord("Nick", "Graham", "EE", 6));
        bst.insert(new StudentRecord("Harrison", "Ford", "ME", 1));
        bst.insert(new StudentRecord("Tyler", "Rodgers", "CS", 3));
        bst.insert(new StudentRecord("Dan", "Toman", "EE", 5));
        bst.insert(new StudentRecord("Tommy", "Jones", "ME", 7));

        System.out.println("Preorder Traversal:");
        bst.print(bst.getPreOrderIterator());

        System.out.println("\nInorder Traversal:");
        bst.print(bst.getInOrderIterator());

        System.out.println("\nPostorder Traversal:");
        bst.print(bst.getPostOrderIterator());
    }
}