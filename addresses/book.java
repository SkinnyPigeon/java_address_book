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

  public Address getAddress( int arrayIndex ) {
    return this.addresses.get( arrayIndex );
  }

  public Address getPersonalAddress( int arrayIndex ) {
    return this.personal.get( arrayIndex );
  }

  public Address getBusinessAddress( int arrayIndex ) {
    return this.business.get( arrayIndex );
  }

  public void sortMainAddressesByName() {
    Collections.sort(this.addresses, new Comparator<Address>() {
        public int compare(Address nameOne, Address nameTwo) {
            return nameOne.getName().compareTo(nameTwo.getName());
        }
    });
  }

  public void sortPersonalAddressesByName() {
    Collections.sort(this.personal, new Comparator<Address>() {
        public int compare(Address nameOne, Address nameTwo) {
            return nameOne.getName().compareTo(nameTwo.getName());
        }
    });
  }

  public void sortBusinessAddressesByName() {
    Collections.sort(this.business, new Comparator<Address>() {
        public int compare(Address nameOne, Address nameTwo) {
            return nameOne.getName().compareTo(nameTwo.getName());
        }
    });
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