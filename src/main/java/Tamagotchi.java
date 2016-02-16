public class Tamagotchi {
  private String mName;
  private Integer mFoodLevel;
  private Integer mSleepLevel;
  private Integer mActivityLevel;


  public Tamagotchi(String name) {
    mName = name;
    mFoodLevel = 10;
    mSleepLevel = 10;
    mActivityLevel = 10;

  }

  public String getName() {
    return mName;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getActivityLevel() {
    return mActivityLevel;
  }

  public int timePasses() {
    return mFoodLevel -=3;
    return mSleepLevel -=2;
    return mActivityLevel -=1;
  }



  // public int costToShip() {
  //   return (this.getVolume() + this.getDistanceCost()) /2;
  //
  // }
}
