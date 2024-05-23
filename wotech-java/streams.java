// https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {


    var shopsItems = new ArrayList<String>();
    shopsItems.add ("Glass table");
    shopsItems.add ("Wooden table");
    shopsItems.add ("Round table");
    shopsItems.add ("Trapdoor");
    shopsItems.add ("Couch");
    shopsItems.add ("Bed");	
    shopsItems.add ("Sofa");
    shopsItems.add ("Doors");

      /*var filteredShopsItems = new ArrayList<String>();
      for(var item:  shopsItems){
        if (item.contains ("table")){
          filteredShopsItems.add(item);
        }
      }*/ //can be written with stream

  var filteredShopsItems = shopsItems
    .stream() // greates stream of arraylist, // between string and collect we can do actions!
    .filter(item -> item.contains("table")) // if item contains table then we use item
    //.skip(3) // skip first 3 items
    //.limit(2) // take only 2 elements
    //.forEach(x -> System.out.println("TEST " + x)); // print all items, use without collect
    .collect(Collectors.toList());// collects all items from stream into list
    
    System.out.println(filteredShopsItems);
    

    
  }
}

