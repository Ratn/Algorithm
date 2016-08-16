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
public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(){}
    Tree( int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public static Tree createTree() {
        Tree root = new Tree(1);
        root.left = new Tree(2); root.right = new Tree(3);
        root.left.left = new Tree(4);root.left.right = new Tree(5);
        root.right.left = new Tree(6);root.right.right = new Tree(7);
        root.right.right.right = new Tree(8);
        return root;
    }
}
