/**
 * This is the Basis for a Binary Search Tree (Root Node)
 * @Author Toussaint Turnier
 * @param <PersonRecord>
 */
public class BinaryTreeBasis<PersonRecord> {

    protected TreeNode<PersonRecord> root;

    /**
     * Constructor
     */

    public BinaryTreeBasis(){
        this.root = null;
    }

    /**
     * Constructor For Root items
     * @param rootItem
     */
    public BinaryTreeBasis(PersonRecord rootItem){
        this.root = new TreeNode<>(rootItem, null, null);
    }


    /**
     * Checks if Tree is Empty.
     */
    public boolean isEmpty(){
        if (root == null)
            return true;
        else return false;
    }
    /**
     * Empties the tree
     */
    public void makeEmpty(){
        this.root = null;
    }

    /**
     * Sets the Root Node.
     */
    public void setRoot(PersonRecord newItem) {
        if (this.root != null) {
            this.root.setElement(newItem);
        }else {
            this.root = new TreeNode<PersonRecord>(newItem, null, null);
        }
    }

    /**
     * Get the Root Node.
     */
    public TreeNode<PersonRecord> getRoot(){
        return this.root;
    }

} // End of BinaryTreeBasis Class.

