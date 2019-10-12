/**
 * This is a Node Class meant to represent a Binary Tree
 */
public class TreeNode<PersonRecord> {
    private PersonRecord element;
    private TreeNode<PersonRecord> leftTreeNode; //Node with Lower value.
    private TreeNode<PersonRecord> rightTreeNode;//Node with Higher value.

    /**
     * Constructor
     */
    public TreeNode() {
        this(null,null,null);
    }

    /**
     * Constructor designed for leaf nodes.
     * @param element to be stored
     */
     public TreeNode(PersonRecord element){
        this(element, null,  null);
    }

    /**
     * Constructor for non-leaf nodes.
     * @param value
     * @param lowervalue
     * @param highervalue
     */
    public TreeNode(PersonRecord value, TreeNode<PersonRecord>lowervalue, TreeNode<PersonRecord> highervalue){
        element = value;
        leftTreeNode = lowervalue;
        rightTreeNode = highervalue;
    }




    /**
     * Sets the Element of the object.
     */
    public void setElement(PersonRecord element){
        this.element = element;
    }

    /**
     * Gets the Element of the object.
     */
    public PersonRecord getElement(){

        return this.element;
    }

    /**
     * Sets the Right Tree Node. (Upper bound)
     */
   public void setRightTreeNode(TreeNode<PersonRecord> right){
        this.rightTreeNode = right;
    }
    /**
     * Gets the Right Tree Node. (Upper bound)
     */
   public TreeNode<PersonRecord> getRightTreeNode(){
        return rightTreeNode;
    }
    /**
     * Sets the Left Tree Node. (Lower bound)
     */
   public void setLeftTreeNode(TreeNode<PersonRecord> left){
       this.leftTreeNode = left;
   }
    /**
     * Gets the Right Tree Node. (Lower bound)
     */
    public TreeNode<PersonRecord> getLeftTreeNode(){
        return leftTreeNode;
    }

} //End of TreeNode Class
