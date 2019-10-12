import java.util.LinkedList;
/**
 * This is the TreeIterator its purpose is to be able to iterate
 * @Author Toussaint Turnier
 * @param <PersonRecord>
 */
public class TreeIterator<PersonRecord> implements java.util.Iterator<PersonRecord> {

    /**
     * The collection traversed by this iterator
     */
    private BinaryTreeBasis<PersonRecord> tree = new BinaryTreeBasis<PersonRecord>();


    /**
     * An ordered list of nodes traversed by this iterator.
     * Empty queue indicates no traversal type currently selected or
     * end of current traversal has been reached
     */
    private LinkedList<TreeNode<PersonRecord>> queue;

    /**
     * Constructs an iterator over a binary tree.
     * @param tree A reference to a binary tree
     */
    public TreeIterator(BinaryTreeBasis<PersonRecord> tree) {
        this.tree = tree;
        // empty queue indicates no traversal type currently
        // selected or end of current traversal has been reached
        this.queue = new LinkedList<>();
    }

    /**
     * Returns true if the iteration has more elements.
     * (In other words, returns true if next() would return an element rather than throwing an exception.)
     *
     * @return A boolean value specifying if there is an element to be returned
     */
    public boolean hasNext() {
        return !this.queue.isEmpty();
    }

    /**
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    public PersonRecord next() throws java.util.NoSuchElementException {
        return this.queue.remove().getElement();
    }

    /**
     * Removes from the underlying binary tree the last element returned by this iterator (optional operation).
     * It can be called only once per call to next() method. The behavior of an iterator is unspecified if the underlying
     * collection is modified while the iteration is in progress in any way other than by calling this method.
     *
     * @throws UnsupportedOperationException if the remove operation is not supported by this iterator
     * @throws IllegalStateException         if the next method has not yet been called, or the remove method has already been
     *                                       called after the last call to the next method
     */
    public void remove() throws UnsupportedOperationException {
        // Optional means we can implement it or throw an UnsupportedOperationException. This operation is optional because
        // sometimes we just don't want the iterator's content to be modified. An iterator is normally used for executing.
        //The default implementation throws an instance of UnsupportedOperationException and performs no other action.
        throw new UnsupportedOperationException();
    }

    /**
     * Sets the traversal type to be preorder.
     */
    public void setPreorder() {
        this.queue.clear();
        this.preorder(this.tree.root);
    }

    /**
     * Sets the traversal type to be inorder.
     */
    public void setInorder() {
        this.queue.clear();
        this.inorder(this.tree.root);
    }

    /**
     * Sets the traversal type to be postorder.
     */
    public void setPostorder() {
        this.queue.clear();
        this.postorder(this.tree.root);
    }

    /**
     * Traverses in preorder.
     *
     * @param treeNode A reference to a tree node
     */
    private void preorder(TreeNode<PersonRecord> treeNode) {
        if (treeNode != null) {
            this.queue.add(treeNode);
            preorder(treeNode.getLeftTreeNode());
            preorder(treeNode.getRightTreeNode());

        }
    }

    /**
     * Traverses in inorder.
     *
     * @param treeNode A reference to a tree node
     */
    private void inorder(TreeNode<PersonRecord> treeNode) {
        if (treeNode != null) {
            inorder(treeNode.getLeftTreeNode());
            this.queue.add(treeNode);
            inorder(treeNode.getRightTreeNode());

        }
    }

    /**
     * Traverses in postorder.
     *
     * @param treeNode A reference to a tree node
     */
    private void postorder(TreeNode<PersonRecord> treeNode) {
        if (treeNode != null) {
            postorder(treeNode.getLeftTreeNode());
            postorder(treeNode.getRightTreeNode());
            this.queue.add(treeNode);

        }
    }
}
