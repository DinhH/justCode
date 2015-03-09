//given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

class Solution{
public boolean pathSum(TreeNode root, int sum) {
	if (root == null){
		return false;
	}
	if (root.val == sum && (root.left == null && root.right == null)){
		return true;
	}
	return pathSum(root.left, sum - root.val)
			|| pathSum(root.right, sum - root.val);
	}
}
