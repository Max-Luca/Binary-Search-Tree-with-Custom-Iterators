import java.util.*;

public class PostOrderIterator implements Iterator<TreeNode> {
    private Stack<TreeNode> stack1 = new Stack<>();
    private Stack<TreeNode> stack2 = new Stack<>();

    public PostOrderIterator(TreeNode root) {
        if (root != null) stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack2.isEmpty();
    }

    @Override
    public TreeNode next() {
        return stack2.pop();
    }
}