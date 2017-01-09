import static org.junit.Assert.assertEquals;
import org.junit.*;

import addresses.*;

public class BusinessTest {

  Business me;

  @Before
  public void before() {
    me = new Business( "Skinny Pigeon", "17/6 Uppper Grove Place", "07540309150" );
  }

  @Test
  public void hasName() {
    assertEquals( "Skinny Pigeon", me.getName() );
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