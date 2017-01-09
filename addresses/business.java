package addresses;

public class Business implements Address {

  private String name;
  private String address;
  private String phoneNumber;

  public Business( String name, String address, String phoneNumber ) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  
}