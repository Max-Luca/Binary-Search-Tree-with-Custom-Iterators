import java.util.*;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(StudentRecord record) {
        root = insertRecursive(root, record);
    }

    private TreeNode insertRecursive(TreeNode node, StudentRecord record) {
        if (node == null) {
            return new TreeNode(record);
        }
        if (record.getStudentId() < node.data.getStudentId()) {
            node.left = insertRecursive(node.left, record);
        } else {
            node.right = insertRecursive(node.right, record);
        }
        return node;
    }

    public Iterator<TreeNode> getPreOrderIterator() {
        return new PreOrderIterator(root);
    }

    public Iterator<TreeNode> getInOrderIterator() {
        return new InOrderIterator(root);
    }

    public Iterator<TreeNode> getPostOrderIterator() {
        return new PostOrderIterator(root);
    }

    public void print(Iterator<TreeNode> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().data);
        }
    }
}