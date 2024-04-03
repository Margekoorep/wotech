public class Main {
  public static void main(String[] args) {
    
  // Winter, Spring, Summer, Atumn
  // Warm jacket; t-shirt, swimming suite, rain coat
    //String season = "spring";

     //if (season == "winter") {
      // System.out.println("Wear a warm jacket");
     //} else if (season == "spring") {
      //System.out.println("Wear a t-shirt");
    //} else if (season == "summer") {
     // System.out.println("Wear a swimming suite");
     // } else if (season == "autumn") {
     // System.out.println("Wear a rain coat");
    //}
   // else {
    //  System.out.println("I do not recognize this season");
    //}

    // until +5 wear super warm
    // +5 - 15 warm
    // 15-30 normal
    //+ cooling 

    double temperature = 30;
    if (temperature <= 5) {
      System.out.println("Wear super warm");
    } else if (temperature <= 15){
      System.out.println("Wear warm");
    } else if (temperature <= 30){
      System.out.println("Wear normal");
    }else if (temperature > 30){
      System.out.println("Wear cooling");
    } else {
      System.out.println("I do not recognize this temperature");
    }
    
    
  }

  
}
