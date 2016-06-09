import javax.sound.midi.*;

public class MusicTest1 {

  //---Methods---
  public static void main(String[] args) {
    MusicTest1 mt = new MusicTest1();
    mt.play();
  } //Close Main

  public void play() {
    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      System.out.println("We got a Sequencer!");
    } catch(MidiUnavailableException ex) {
        System.out.println("Bummer");
    }
  } //Close Play
}
