package Bai4;

import java.util.List;

public class BST <E extends Comparable<E>>extends AbstractTree<E>  {
    protected TreeNode<E> root;
    protected int size=0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i <objects.length ; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E object) {
        if(root ==null){
            root =createNewNode(object);
            size++;
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current=root;
            while(current!=null){
                parent=current;
                if (object.compareTo(current.element)<0){
                    current=current.left;
                }else if (object.compareTo(current.element)>0){
                    current=current.right;
                }else return false;
            }
            if (object.compareTo(parent.element)<0){
                parent.left=createNewNode(object);
            }else if(object.compareTo(parent.element)>0){
                parent.right=createNewNode(object);
            }
            size++;
            return true;
        }
        return false;
    }
    @Override
    public int getSize(){
        return  size;
    }

    private TreeNode<E> createNewNode(E object) {
         return new TreeNode<>(object);
    }
    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
