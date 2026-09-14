class Solution {



    public int level(TreeNode root, int[] maxDia){

        if(root == null) return 0;
        int leftLevels = level(root.left,maxDia);
        int rightLevels = level(root.right,maxDia);
        int dia = leftLevels + rightLevels;
        maxDia[0] = Math.max(dia,maxDia[0]);
        return 1 + Math.max(leftLevels , rightLevels);
    }
    public int diameterOfBinaryTree(TreeNode root) {

        int maxDia[] = {0};
        level(root,maxDia);
        return maxDia[0];
    }
}