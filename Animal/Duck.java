public class Duck extends Animal {

  int size;

//---Constructors---
  //---No Arguments---
  public Duck() {
    System.out.println("Quack!");
    size = 27;

    System.out.println("The size of the duck is: " + size);
  }

  //---Arguments---
  public Duck(int newSize) {
    System.out.println("Quack!");
    size = newSize;

    System.out.println("The size of the duck is: " + size);
  }
}
