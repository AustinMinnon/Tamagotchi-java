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

  public int feed() {
    return mFoodLevel +=1;
  }

  public int sleep() {
    return (mSleepLevel +=1);
  }

  public int play() {
    return (mActivityLevel +=1);
  }

  public void timePasses() {
  mFoodLevel -=2;
  mSleepLevel -=2;
  mActivityLevel -=1;

  }

  public boolean isAlive() {
    if (mFoodLevel >0 && mSleepLevel >0 && mActivityLevel >0){
      return true;
    }else{
      return false;
    }
  }
}
