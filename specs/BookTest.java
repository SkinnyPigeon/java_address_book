import static org.junit.Assert.assertEquals;
import org.junit.*;

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

  // @Test
  // public void canTellIfClassIsPersonal() {
  //   book.addAddress( me );
  //   assertEquals( "Personal", book.getFirstPlaceClass() );
  // }

}