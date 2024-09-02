import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.aplications.Calculator;
import test.RealCal;
import test.Test;

public class App {

 
  public static void main(String[] args) throws Exception {

    
    Test testObject = new Test();

    testObject.testArrayList(null);
    RealCal<Integer> ra = new RealCal<>();
    ra.run(testObject.getList(),"ArrayLIst");
    
     testObject.testSimpleList(null);;
     ra.run(testObject.getList(),"simpleLIst");
    
 

    
  




  }

  
}
