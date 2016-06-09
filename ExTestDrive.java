class MyEx extends Exception{}

public class ExTestDrive {

  //---Methods---
  public static void main(String[] args) {
    String test = args[0];
    try {
      System.out.print("t");
      doRisky(test);
      System.out.print("r");
      System.out.print("o");
    } catch (MyEx e) {
      System.out.print("a");
    } finally {
      System.out.print("w");
      System.out.println("s");
    }
  }//Close main

  static void doRisky(String t) throws MyEx {
    System.out.print("h");

    if ("yes".equals(t)) {
      throw new MyEx();
    }
  }//Close doRisky
}//Close Class
