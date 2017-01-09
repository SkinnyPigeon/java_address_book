package addresses;

public interface Address {

  public String getName();

  public String getAddress();

  public String getPhoneNumber();

  public String getTheType();

  public void editTheAddress( String newAddress );

}