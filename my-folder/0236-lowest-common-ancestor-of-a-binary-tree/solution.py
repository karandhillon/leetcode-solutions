class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        if root == None:
            return None
        
        if root.val == p.val or root.val == q.val:
            return root
        
        leftMatch = None
        if root.left != None:
            leftMatch = self.lowestCommonAncestor(root.left, p, q)
        
        rightMatch = None
        if root.right != None:
            rightMatch = self.lowestCommonAncestor(root.right, p, q)
        
        if leftMatch != None and rightMatch != None:
            return root
        elif leftMatch != None:
            return leftMatch
        
        return rightMatch
