public class GoodDog {
  private int size;

  //---Getters---
  public int getSize() {
    return size;
  }

  //---Setters---
  public void setSize(int s) {
    size = s;
  }

  //---Methods---
  public void bark() {
    if (size > 60) {
      System.out.println("Woof! Woof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yip! Yip!");
    }
  }
}
