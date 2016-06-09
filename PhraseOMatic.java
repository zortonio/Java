public class PhraseOMatic {
  public static void main(String[] args) {
    String[] wordListOne = {"9 to 5","transdimensional","Super-high","High to low","lose-lose","back-end","cloud-based","invasive","enlightened","5 pillars","most pertinant way","flexible"};
    String[] wordListTwo = {"strengthened","gooey","critically needed","facing","focused","spread out","tightly knit","tagged","creative","poised","connected","concentrated","given advantage","similarly minded","focused","freely given","collaborative","given priority"};
    String[] wordListThree = {"procedure","boiling-point","end goal","structural design","meets standards","master plan","hive-mind","gateway","area","futurecast","prediciment","goal"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    System.out.println("What we need is a " + phrase);
  }
}
