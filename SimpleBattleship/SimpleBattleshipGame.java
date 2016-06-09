import java.util.*;

public class SimpleBattleshipGame {

  //Declare and initialize the variable we'll need
  private GameHelper helper = new GameHelper();
  private ArrayList<SimpleShip> shipList = new ArrayList<SimpleShip>();
  private int numOfGuesses = 0;

  //----Methods----
  public static void main(String[] args) {
    SimpleBattleshipGame game = new SimpleBattleshipGame();
    game.setUpGame();
    game.startPlaying();
  }

  private void setUpGame() {
    //Make three ShimpleShip objects and give them locations.
    SimpleShip one = new SimpleShip();
    one.setName("Nina");
    SimpleShip two = new SimpleShip();
    two.setName("Pinta");
    SimpleShip three = new SimpleShip();
    three.setName("Santa Maria");

    shipList.add(one);
    shipList.add(two);
    shipList.add(three);

    //Print brief instructions for the user
    System.out.println("Your goal is to sink three ships.");
    System.out.println("The Nina, the Pinta, and the Santa Maria.");
    System.out.println("Try to sink them all in the fewest number of guesses.");

    for (SimpleShip shipToSet : shipList) { //Repeat with each Ship in the list
      ArrayList<String> newLocation = helper.placeShip(3); //Ask helper for ship locaitons
      shipToSet.setLocationCells(newLocation); //Call the setter method on this ship to give it the location we just got from the helper
    }
  }

  private void startPlaying() {
    while (!shipList.isEmpty()) { //As long as the ship list is NOT empty
      String userGuess = helper.getUserInput("Enter a guess:"); //Get user input
      checkUserGuess(userGuess); //Check the user input using our checkUserGuess method
    }
    finishGame(); //Call our finish game method
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses++;
    String result = "miss";

    for (SimpleShip shipToTest : shipList) {
      result = shipToTest.checkYourself(userGuess);
      if (result.equals("Hit")) {
        break;
      }
      if (result.equals("Kill")) {
        shipList.remove(shipToTest);
        break;
      }
    }
    System.out.println(result);
  }

  private void finishGame() {
    System.out.println("All ships are dead! Your fleet is victorious!");
    if (numOfGuesses <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
      System.out.println("You sunk them before they sunk you!");
    } else {
      System.out.println("Took you long enough! " + numOfGuesses + " guesses. Really!?");
      System.out.println("Many brave soldiers died because of your mistakes...");
    }
  }
}
