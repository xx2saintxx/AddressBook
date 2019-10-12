/**
 * This class represents a PersonsRecord, this information will go into an Address
 * @Author Toussaint Turnier
 */
public class PersonRecord {
    String x; //Name
    String y; //Phone Number
    String z; // Address




/**
 * Constructor
 * @param address
 * @param name
 * @param phoneNumber
 */


    public PersonRecord(String name, String phoneNumber, String address){
        this.x = name;
        this.y = phoneNumber;
        this.z = address;
    }

    /**
     * Get name
     */
    public String getName(){
        return this.x;
    }
    /**
     * Set name
     */
    public void setName(String name){
        this.x = name;
    }
    /**
     * Get addess
     */
    public String getAddress(){
        return this.z;
    }
    /**
     * Set address
     */
    public void setAddress(String address){
        this.z = address;
    }
    /**
     * Get name
     */
    public String getPhoneNumber(){
        return this.y;
    }
    /**
     * Set name
     */
    public void setPhoneNumber(String phoneNumber){
        this.y = phoneNumber;
    }


}//End of PersonRecord
