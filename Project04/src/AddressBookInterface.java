/**
 *  This is the interface for the Binary Search tree object(Address book)
 * @Author Toussaint Turnier
 * @Version 1.0
 */
public interface AddressBookInterface<E> {

    /**
     * inserts the Name, Address, and Telephone number of a Person
     */
    void add();

    /**
     * Deletes the Name, Address, and Telephone number of a Person
     */
    void delete();

    /**
     * Changes the Name, Address, and Telephone number of a Person
     */
    void modify();

    /**
     * Retrieves the Name, Address, and Telephone number of a Person
     */
    void retrieve();

    /**
     * Clears the entire Address book.
     */
    void makeEmpty();

    /**
     * Fills the entire address book
     */
    void makeFull();

}
