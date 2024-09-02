package test;

import java.util.ArrayList;
import java.util.List;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class Test {

    private List<Integer> list;

    public void testArrayList(List<Integer> randomNumbers){
        loadDataArrayList(randomNumbers);
    }

    public void testSimpleList(List<Integer> randomNumbers){
        loadDataSimpleList(randomNumbers);
    }

    private void loadDataArrayList(List<Integer> randomNumbers) {
         list = new ArrayList<Integer>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            list.add(randomNumbers.get(i));
        }
    }

    private void loadDataSimpleList(List<Integer> randomNumbers) {
         list = new SimpleListV2<Integer>();
         for (int i = 0; i < randomNumbers.size(); i++) {
             list.add(randomNumbers.get(i));
         }
    }

    public List<Integer> getList() {
        return list;
    }

}
