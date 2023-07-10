import java.util.LinkedList;
import java.util.Queue;

public class SimpleTree {
    private TreeNode root;

    public void add(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            addNode(root, value);
        }
    }

    private void addNode(TreeNode node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                node.left = new TreeNode(value);
            } else {
                addNode(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(value);
            } else {
                addNode(node.right, value);
            }
        }
    }

    public void traverseDepthFirst() {
        traverseDepthFirst(root);
    }

    private void traverseDepthFirst(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value);

        traverseDepthFirst(node.left);
        traverseDepthFirst(node.right);
    }

    public void traverseBreadthFirst() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.value);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private class TreeNode {
        private int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}
