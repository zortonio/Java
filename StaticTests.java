public class StaticTests extends StaticSuper {
  private static int rand;

  public void Static() {
    rand = (int) (Math.random() * 6);
    System.out.println("Static block " + Integer.toString(rand));
  }

  public void StaticTests() {
    System.out.println("Constructor");
  }

  public static void main(String[] args) {
    System.out.println("in main");
    StaticTests st = new StaticTests();
    st.Static();
  }
}
