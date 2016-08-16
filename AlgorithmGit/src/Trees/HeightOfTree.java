/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author ratn
 */
public class HeightOfTree {
    public static int getHeight(Tree root) {
        if ( root == null) return 0;
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        Tree root = Tree.createTree();
        System.out.println("Height of Tree : " + getHeight(root) );
    }
}
