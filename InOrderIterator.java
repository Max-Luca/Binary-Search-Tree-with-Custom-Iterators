import java.util.*;

public class InOrderIterator implements Iterator<TreeNode> {
    private Stack<TreeNode> stack = new Stack<>();
    private TreeNode current;

    public InOrderIterator(TreeNode root) {
        current = root;
    }

    @Override
    public boolean hasNext() {
        return (current != null || !stack.isEmpty());
    }

    @Override
    public TreeNode next() {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        TreeNode node = current;
        current = current.right;
        return node;
    }
}