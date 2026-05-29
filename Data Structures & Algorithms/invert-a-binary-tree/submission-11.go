/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func invertTree(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    }

    leftSubTree := invertTree(root.Left)
    rightSubTree := invertTree(root.Right)

    root.Left = rightSubTree
    root.Right = leftSubTree

    return root
}
