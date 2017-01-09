package addresses;
import addresses.*;
import java.util.*;

public class Book {

  private ArrayList< Address > addresses;

  public Book() {
    this.addresses = new ArrayList< Address >();
  }

  public void addAddress( Address address ) {
    this.addresses.add( address );
  }

  public int addressCount() {
    return this.addresses.size();
  }

  // public String getFirstPlaceClass() {
  //   // for( int i = 0; i < this.addresses.size() - 1; i++ ) {
  //     if( this.addresses.get( 0 ).getTypeOfClass == Personal ) {
  //       return "Personal";
  //     // }
  //   }
  // }

}