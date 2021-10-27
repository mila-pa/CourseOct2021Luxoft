import java.lang.reflect.Array;
import java.util.Arrays;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class MyStringArrayListMain {

    public static void main(String[] args) {
        String[] array = new String[10];

        MyStringArrayList arr = new MyStringArrayList(6);

        for (int i = 0; i < array.length; i++) {
            arr.add(i + "11");


            System.out.println(arr.toString());
        }

    }
}
