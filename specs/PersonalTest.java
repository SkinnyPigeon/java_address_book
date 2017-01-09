import static org.junit.Assert.assertEquals;
import org.junit.*;

import addresses.*;

public class PersonalTest {

  Personal me;

  @Before
  public void before() {
    me = new Personal( "Euan" );
  }

  @Test
  public void hasName() {
    assertEquals( "Euan", me.getName() );
  }

}