/**
 * This is the Object "Address book" it contains the methods of the Address book
 * @Author Toussaint Turnier
 * @Version 1.0
 */
public class AddressBook<T>{

private BinarySearchTree<PersonRecord> tree = new BinarySearchTree<PersonRecord>();

/**
* Adds the Name, Address, and Telephone number of a Person
* @param x represents the person to be added.
*/
public void add(PersonRecord x){
TreeNode<PersonRecord> node = new TreeNode<>();
tree.insert(x, node);
System.out.println("" +x.getName());
System.out.println("" +x.getPhoneNumber());
System.out.println("" +x.getAddress());
}

/**
* Deletes the Name, Address, and Telephone number of a Person
* @param x represents the person to be deleted.
*/
public void delete(PersonRecord x){
TreeNode<PersonRecord> node = new TreeNode<>();
tree.delete(x, node);
}

/**
* Changes the Name, Address, and Telephone number of a Person
* @param x represents the person that is going to be replaced.
* @param z represents the person that is replacing x.
*/
public void change(PersonRecord x, PersonRecord z){
tree.search(x);
System.out.println("Replacing...");
delete(x);
add(z);
System.out.println("" +z.getName());
System.out.println("" +z.getPhoneNumber());
System.out.println("" +z.getAddress());
}

/**
* Retrieves the Name, Address, and Telephone number of a Person
*/
public void retrieve(PersonRecord x){
BinaryTreeBasis<PersonRecord> root = new BinaryTreeBasis<>();
tree.search(x);
}

/**
* Clears the entire Address book.
*/
public void makeEmpty(){
this.tree = null;
}


} //End of AddressBook Class.
