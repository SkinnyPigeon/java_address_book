import static org.junit.Assert.assertEquals;
import org.junit.*;

import addresses.*;

public class PersonalTest {

  Personal me;

  @Before
  public void before() {
    me = new Personal( "Euan", "17/6 Uppper Grove Place", "07540309150" );
  }

  @Test
  public void hasName() {
    assertEquals( "Euan", me.getName() );
  }

  @Test
  public void hasAddress() {
    assertEquals( "17/6 Uppper Grove Place", me.getAddress() );
  }

  @Test
  public void hasPhoneNumber() {
    assertEquals( "07540309150", me.getPhoneNumber() );
  }

}