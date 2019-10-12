/**
 * This Class represents a Binary Search Tree and it's methods.
 * @Author Toussaint Turnier
 */
public class BinarySearchTree<T> implements Comparable<PersonRecord> {
String key = "";

/**
* Searches for the Node inside of the Tree that holds the element.
* @param x represents the element to be searched.
*/
public boolean search(PersonRecord x){
BinaryTreeBasis<PersonRecord> tree = new BinaryTreeBasis<>();
TreeIterator findMe = new TreeIterator(tree);
while (findMe.hasNext())
if(findMe.next() != x){
return false;
}
System.out.println(""+ x.getName());
System.out.println(""+ x.getPhoneNumber());
System.out.println(""+x.getAddress());
return true;
}

/**
* Inserts a Node with an element into the Tree.
* @param record represents the element to be inserted.
*@param tree represents the Tree.
*/
public boolean insert(PersonRecord record, TreeNode<PersonRecord> tree){
key = record.getName();
BinaryTreeBasis<PersonRecord> root = new BinaryTreeBasis<>(); //Calls constructor
// Find the root value
if (root.isEmpty()) { // If there is no root, (Empty tree.)
System.out.println("Data added");
root.setRoot(record); //Create a new TreeNode the new element.
return true;
} else {
if (compareTo(tree.getElement()) == 1){ //If new element is greater than root
tree.setRightTreeNode(tree);
System.out.println("Data added. Greater than root");
return true;} else {
if (compareTo(tree.getElement()) == -1){ //If new element is less than root
tree.setLeftTreeNode(tree);
System.out.println("Data added. Less than root");
return true; } else
    System.out.println("Data failed to add");
return false;
} } }

/**
 *  Deletes a Node with a selected Element.
 *  @param x represents the element to be deleted
 * @param tree represents the tree being searched.
*/
public boolean delete(PersonRecord x, TreeNode<PersonRecord> tree) {
if (search(x)){ //If element is found, set to null
tree.setElement(null);
System.out.println("Data deleted");
return true;
}
return false;
}


@Override
public int compareTo(PersonRecord o) {
        return key.compareTo(o.getName());
    }
} //End of Binary Search Tree Class.
