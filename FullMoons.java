import java.util.Calendar;

public class FullMoons {
  private static int DAY_IM = 1000*60*60*24;

  public static void main(String[] args) {
    int x;
    Calendar c = Calendar.getInstance();
    c.set(2004,0,7,15,40);

    System.out.println(String.format("Full moon on %tc", c.getTime()));

    for (x=0; x<5;x++) {
      long day1 = c.getTimeInMillis();

      day1 += (DAY_IM * 29.52);
      c.setTimeInMillis(day1);

      System.out.println(String.format("Full moon on %tc", c.getTime()));
    }

  }
}
