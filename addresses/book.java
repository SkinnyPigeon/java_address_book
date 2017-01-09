package addresses;
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

}