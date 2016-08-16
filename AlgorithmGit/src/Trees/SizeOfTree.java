/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 * Size of a tree is the number of elements present in the tree. Size of the below tree is 7
 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
 * @author ratn
 */

public class SizeOfTree {
    public static int calculalteSize( Tree root) {
        if ( root == null ) return 0;
        return calculalteSize(root.left) +  1 + calculalteSize(root.right);
    }
    public static void main(String[] args) {
        Tree root = Tree.createTree();
        System.out.println(calculalteSize(root));
    }
}
