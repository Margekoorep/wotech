FORK CLASS

  //Fork has 3 or 4  spikes
//Fork has a material (silver, or plastic, wood)
//Fork has sharpness in the spikes. 0
//A fork can stab and whenever a fork stabs, it gets more dull
//Sharpness is gonna decrease by 0.1

public class Fork{
  public int spikeCount;
  public String material;
  public int sharpness = 1000;

  //new Fork(3, "wood")
  public Fork(int spikeCount, String material){
    this.spikeCount = spikeCount;
    this.material = material;
  }

  public void stab(){
    sharpness = sharpness - 1;
  }
}

MAIN CLASS

  public class Main {
    public static void main(String[] args) {
        var fork = new Fork(4, "Silver");

        System.out.println("The fork made out of " + fork.material + " has " +  fork.spikeCount + " spikes in total. And the sharpness is " + fork.sharpness);

        System.out.println("The fork is made out of " + fork.material);

        System.out.println("The fork has " + fork.spikeCount + " spikes in total.");

        System.out.println("And the sharpness is " + fork.sharpness);

        // we will create a stabbing machine. 

        for(int i = 0; i < 100; i++){
            fork.stab();
        }
        System.out.println("The sharpness after 100 stabs is " + fork.sharpness);
    }
}
