/**
 * This is the Object "Address" it contains the street, city, state, and zip code
 * @Author Toussaint Turnier
 * @Version 1.0
 */
public class Address {
   private String street;
   private String city;
   private String state;
   private String zipcode;

    /**
     * Constructor
     * @param str
     * @param cty
     * @param st
     * @param zcode
     */
    public Address(String str, String cty, String st, String zcode){
        this.street = str;
        this.city = cty;
        this.state = st;
        this.zipcode = zcode;
    }
/**
*  Sets the Street.
*/
public void setStreet(String street){
        this.street = street;
    }

    /**
     * Gets the Street
     */
    public String getStreet(){
        return this.street;
    }
    /**
     *  Sets the City.
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Gets the Street
     */
    public String getCity(){
        return this.city;
    }
    /**
     *  Sets the state
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * Gets the Street
     */
    public String getState(){
        return this.state;
    }
    /**
     *  Sets the zipcode.
     */
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    /**
     * Gets the Street
     */
    public String getZipcode(){
        return this.zipcode;
    }

} //End of Address class.
