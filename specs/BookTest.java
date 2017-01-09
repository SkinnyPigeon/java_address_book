import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import addresses.*;

public class BookTest {

  Personal me;
  Business sp;
  Book book;

  @Before
  public void before() {
    me = new Personal( "Euan", "17/6 Uppper Grove Place", "07540309150" );
    sp = new Business( "Skinny Pigeon", "17/6 Uppper Grove Place", "07540309150" );
    book = new Book();
  }

  @Test
  public void bookCanAddPersonal() {
    book.addAddress( me );
    int count = book.addressCount();
    assertEquals( 1, count );
  }

  @Test
  public void bookCanAddBusiness() {
    book.addAddress( sp );
    int count = book.addressCount();
    assertEquals( 1, count );
  }

  @Test
  public void personalListStartAsEmpty() {
    assertEquals( 0, book.personalCount() );
  }

  @Test
  public void personalListCanAddPerson() {
    book.addAddress( me );
    book.addAddress( sp );
    book.sortIntoTypes();
    assertEquals( 1, book.personalCount() );
  }

  @Test
  public void personalListWillNotTakeBusiness() {
    book.addAddress( sp );
    book.sortIntoTypes();
    assertEquals( 0, book.personalCount() );
  }

  @Test
  public void originalListIsLeftUntouchedByTheSort() {
    book.addAddress( me );
    book.addAddress( sp );
    book.sortIntoTypes();
    assertEquals( 2, book.addressCount() );
  }

  @Test
  public void businessListCanAddBusiness() {
    book.addAddress( me );
    book.addAddress( sp );
    book.sortIntoTypes();
    assertEquals( 1, book.businessCount() );
  }

  @Test
  public void addressBookIsBuiltInOrderOfAddition() {
    book.addAddress( sp );
    book.addAddress( me );
    String name = book.getAddress(0).getName();
    assertEquals( "Skinny Pigeon", name );
  }

  @Test
  public void canSortTheNamesAlphabetically() {
    book.addAddress( sp );
    book.addAddress( me );
    book.sortMainAddressesByName();
    String name = book.getAddress(0).getName();
    assertEquals( "Euan", name );
  }

}