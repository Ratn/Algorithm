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
public class PrintKDistance {
    public static void printKDownNode( Tree root,int k) {
        if ( root == null ) return;
        if ( k == 0 ) {System.out.println( root.data); return; }
        printKDownNode(root.left, k-1);
        printKDownNode(root.right, k-1);
    }
    public static int printKDistance(Tree root,int key, int k) {
        if ( root == null) return -1;
        if ( root.data == key) printKDownNode(root, k);
        int l = printKDistance(root.left, key, k);
        if ( l != -1) {
            if (l+1 == k) System.out.print(root.data);
            else printKDistance(root.left,key,k-l-2);
            return 1+l;
        }
        return 1;
    }
    public static void main(String[] args) {
        Tree root = Tree.createTree();
        int key = 4; int k = 2;
        printKDistance(root,key,k);
    }
}
