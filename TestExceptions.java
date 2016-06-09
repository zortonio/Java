public class TestExceptions {

  //---Methods---
  public static void main(String[] args) {
    String test = "yes";
    try {
      System.out.println("Start Try");
      doRisky(test);
      System.out.println("End Try");
    } catch(ScaryException ex) {
      System.out.println("Scary Exception");
    } finally {
      System.out.println("Finally");
    }
    System.out.println("End of Main");
  }//End Main

  static void doRisky(String test) throws ScaryException {
    System.out.println("Start Risky");
    if ("yes".equals(test)) {
      throw new ScaryException();
    }
    System.out.println("End Risky");
    return;
  }//End doRisky
}
