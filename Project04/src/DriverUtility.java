import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
// #TODO split by gaps

/**
 * Contains helper methods for the AddressBook.
 * @author Toussaint Turnier
 */
public class DriverUtility {
    public static void main (String[] args) throws FileNotFoundException {
        PersonRecord ty = new PersonRecord("", "", "");
        PersonRecord test = new PersonRecord("Karina", "585-8888-984", "State st");
        PersonRecord Changetest = new PersonRecord("Pamela", "981-9999-178", "Lark st");
        AddressBook addressBook = new AddressBook();
        //fill list(works)
        fillList(ty);

        //search(works)
        addressBook.retrieve(test);

        //change(works)
        addressBook.change(test, Changetest);

        //delete(works)
        addressBook.delete(Changetest);
    }

    /**
     * Creates a list of charges.
     */
    private static void fillList(PersonRecord ty) throws FileNotFoundException{
    AddressBook addressBook = new AddressBook();
    ArrayList<String> list = new ArrayList<>();

    Scanner input; // Read the file.
    input = new Scanner(new File("personrecords.txt").getAbsoluteFile()); //Gets the File
    while(input.hasNextLine()){
    list.add(input.nextLine()); }
     int j = 0;
     while (list.size() > j) {
         String[] splitStr = list.get(j).trim().split("\\s+");
         String nameSplit = splitStr[0];
         String PhoneSplit = splitStr[1];
         String AddressSplit = splitStr[2];
     j++;
         ty.setName(nameSplit);
         ty.setPhoneNumber(PhoneSplit);
         ty.setAddress(AddressSplit);
         addressBook.add(ty);
     }
    }

    /**
     * Displays data in order.
     * @param list A reference to a list of data
     *
     */
    private static void displayList(PersonRecord op){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
        System.out.println(list.get(i));
        }
    }

    //    }
   // }

        //PersonRecord p = new PersonRecord("name", "000", "Address");
      //  fillList();
       // AddressBook b = new AddressBook();


//}
    } //End of DriverUtility Class.