package ss10_DSA_List.exercise;
import java.util.Arrays;
import java.util.Objects;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList(5);
        for (int i = 0; i < myList.size() ; i++) {
            myList.setElements(i, i + 1);
        }
        System.out.println(myList);

        myList.add(1, 99);
        System.out.println(myList);
        myList.add(4,999);
        System.out.println(myList);
        System.out.println(myList.remove(1));
        System.out.println(myList);

    }
}
