
import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getActivityLevel());
  }
  @Test
  public void timePasses_foodDecreasesByOne_9() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.timePasses();
    assertEquals(8, myPet.getFoodLevel());
  }
  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(true, myPet.isAlive());
  }
  @Test
  public void feed_plusOneToGetFood_getFood11() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(11, myPet.feed());
  }
  @Test
  public void sleep_plusOneToGetSleep_getSleep11() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(11, myPet.sleep());
  }
  @Test
  public void play_plusOneToGetActivity_getActivity11() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals(11, myPet.play());
  }

  @Test
  public void timePasses_returnsNewAttributeVals_10_10_10() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals("8 8 9", myPet.timePasses());
  }
  // @Test
  // public void isAlive_foodBelow1_false() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   myPet.sleep();
  //   assertEquals(false, myPet.isAlive());
  // }
}
