/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 * Two trees are identical when they have same data and arrangement of data is also same.
 * http://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
 * @author ratn
 */
public class IdenticalTree {
    public static boolean checkIdenticalTree(Tree root1, Tree root2) {
        if ( root1 == null && root2 == null) return true;
        if ( root1 != null && root2 != null)
            return ( root1.data == root2.data && 
                    checkIdenticalTree(root1.left, root2.left) && 
                    checkIdenticalTree(root1.left, root2.left) 
                    );
        return false;
    }
    public static void main(String[] args) {
        Tree root = Tree.createTree();
        Tree root1 = Tree.createTree();
        if ( checkIdenticalTree(root,root1) )
            System.out.println("Tree Identical");
        else 
            System.out.println("Tree not Identical");
    }
}
