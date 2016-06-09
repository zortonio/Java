import java.util.ArrayList;

public class SimpleShip {
  private ArrayList<String> locationCells;
  private String name;

  //---Getters----
  public ArrayList<String> getLocationCells() {
    return locationCells;
  }

  //---Setters---
  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
  }

  public void setName(String n) {
    name = n;
  }

  //---Methods---
  public String checkYourself(String userInput) {
    String result = "miss";
    int index = locationCells.indexOf(userInput);

    if (index >= 0) {
      locationCells.remove(index);

      if (locationCells.isEmpty()) {
        result =  "Kill";
      } else {
        result = "Hit";
      }
    }
    return result;
  }
}
