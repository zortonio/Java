import java.util.Date;
import java.util.Calendar;

public class TestFormats {
  public static void main(String[] args) {
    String s = String.format("%, d",1000000000);
    String t = String.format("I have %,.2f bugs to fix.", 476578.09876);
    String d = String.format("%tc", new Date());
    System.out.println(s);
    System.out.println(t);
    System.out.println(d);
    System.out.println();

    Calendar c = Calendar.getInstance();
    c.set(2016,5,6,18,53);
    long day1 = c.getTimeInMillis();
    day1 += 1000*60*60;
    c.setTimeInMillis(day1);
    System.out.println("New Hour: " + c.get(c.HOUR_OF_DAY));
    c.add(c.DATE, 35);
    System.out.println("Add 35 days " + c.getTime());
    c.roll(c.DATE, 35);
    System.out.println("Roll 35 days " + c.getTime());
    c.set(c.DATE, 1);
    System.out.println("Set to 1 " + c.getTime());
  }
}
