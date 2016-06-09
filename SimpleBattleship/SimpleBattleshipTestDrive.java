public class SimpleBattleshipTestDrive {
  public static void main(String[] args) {
    SimpleShip one = new SimpleShip();

    int[] locations = {2,3,4};

    one.setLocationCells(locations);

    String userGuess = "2";
    String result = one.checkYourself(userGuess);
    String testResult = "failed";

    if (result.equals("hit")) {
      testResult = "passed";
    }
    System.out.println(testResult);
  }
}
