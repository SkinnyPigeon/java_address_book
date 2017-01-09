package addresses;
import addresses.*;
import java.util.*;

public class Book {

  private ArrayList< Address > addresses;
  private ArrayList< Address > personal;
  private ArrayList< Address > business;

  public Book() {
    this.addresses = new ArrayList< Address >();
    this.personal = new ArrayList< Address >();
    this.business = new ArrayList< Address >();
  }

  public void addAddress( Address address ) {
    this.addresses.add( address );
  }

  public int addressCount() {
    return this.addresses.size();
  }

  public String getFirstPlaceClass() {
    String type = this.addresses.get( 0 ).getTheType();
      if( type == "Personal" ) {
        return "Personal";
    }
    return "Unknown";
  }

  public void sortIntoTypes() {
    for( int i = 0; i < this.addresses.size(); i++ ) {
      String type = this.addresses.get( i ).getTheType();
      if( type == "Personal" ) {
        this.personal.add( this.addresses.get( i ));
      } else {
        this.business.add( this.addresses.get( i ));
      }
    }
  }

  public int personalCount() {
    return this.personal.size();
  }

  public int businessCount() {
    return this.business.size();
  }

}