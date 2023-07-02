package interfaceDefaultMethods;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTestMain {

    public static void main(String[] args) {

//        List l = new ArrayList<>();
        CustomList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(i -> System.out.println(i * i));

    }
}
