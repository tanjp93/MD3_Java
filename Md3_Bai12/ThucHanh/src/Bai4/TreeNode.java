package Bai4;

public class TreeNode <E>{
    protected E element;
    protected TreeNode<E>left;
    protected TreeNode<E>right;

    public TreeNode() {
    }

    public TreeNode(E element) {
        this.element = element;
    }
}
