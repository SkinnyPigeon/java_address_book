package addresses;

public class Personal implements Address {

  private String name;

  public Personal( String name ) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
}