import java.util.*;

public class PreOrderIterator implements Iterator<TreeNode> {
    private Stack<TreeNode> stack = new Stack<>();

    public PreOrderIterator(TreeNode root) {
        if (root != null) stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public TreeNode next() {
        TreeNode current = stack.pop();
        if (current.right != null) stack.push(current.right);
        if (current.left != null) stack.push(current.left);
        return current;
    }
}