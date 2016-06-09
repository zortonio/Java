public class TestDrive {
  public static void main(String[] args) {
    System.out.println(Integer.toString(doNumsNewWay()));
  }

  public int doNumsNewWay() {
    ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
    listOfNumbers.add(3);
    int num = listOfNumbers.get(0);
    return num;
  }
}
