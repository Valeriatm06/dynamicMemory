import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import test.RealCal;
import test.Test;

public class App {

 
  public static void main(String[] args) throws Exception {

    List<Integer> randomNumber = generateRandomNumer(10000, 1, 10000);
    
    Test testObject = new Test();

    testObject.testArrayList(randomNumber);
    RealCal<Integer> ra = new RealCal<>();
    ra.run(testObject.getList(),"ArrayLIst");
    
     testObject.testSimpleList(randomNumber);;
     ra.run(testObject.getList(),"simpleLIst");
  }

  public static List<Integer> generateRandomNumer(int size, int min, int max){
    List<Integer> list =  new ArrayList<Integer>();
    for (int i = 0; i < size; i++) {
         int randomNumber = ((int)(Math.random() * (max - min + 1))+min);
         list.add(randomNumber);
    }
    return list;
}
  
}
