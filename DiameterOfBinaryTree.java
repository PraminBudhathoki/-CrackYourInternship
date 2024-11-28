class Solution {
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         calculateHeight(root);
        return maxDiameter;
    }
      private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0; // Base case: height of null node is 0
        }

        // Calculate the height of left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Update the maximum diameter
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
