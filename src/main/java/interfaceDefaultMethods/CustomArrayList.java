package interfaceDefaultMethods;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList implements CustomList{

    private List<Integer> list = new ArrayList<>();

    @Override
    public void add(int item) {
        list.add(item);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

}
