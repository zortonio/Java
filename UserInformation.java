import java.io.*;

public class UserInformation {
  private String userName;
  private int userAge;
  private String redditUserName;

  //----Setters----
  public void setUserName() {
    userName = getUserInput("What is your name?");
  }

  public void setUserAge() {
    userAge = Integer.parseInt(getUserInput("How old are you?"));
  }

  public void setRedditUserName() {
    redditUserName = getUserInput("What is your reddit username?");
  }

  //----Methods----
  public static void main(String[] args) {
    UserInformation u = new UserInformation();
    u.setUserName();
    u.setUserAge();
    u.setRedditUserName();

    System.out.println("Your name is " + u.userName + ", you are " + Integer.toString(u.userAge) + " years old, and your username is " + u.redditUserName +".");
  }

  public String getUserInput(String prompt) {
    String inputLine = null;
    System.out.print (prompt + " ");
    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      inputLine = is.readLine();
      if (inputLine.length() == 0) return null;
    } catch (IOException e){
      System.out.println("IOException: " + e);
    }
    return inputLine;
  }
}
