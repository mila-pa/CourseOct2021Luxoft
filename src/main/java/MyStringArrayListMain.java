import java.lang.reflect.Array;
import java.util.Arrays;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class MyStringArrayListMain {

    public static void main(String[] args) {
//        String[] array = new String[10];

        MyStringArrayList arr = new MyStringArrayList(3);
//        MyStringArrayList arr1 = new MyStringArrayList();
        int myArraySize = arr.myArraySize();
        System.out.println("size = " + arr.myArraySize());
        arr.add("111");
        arr.add("222");
        arr.add("333");
        arr.add("444");
        arr.add("555");
        arr.add("666");

        System.out.println(arr);

        for (int i = 0; i < arr.myArraySize(); i++) {
//            arr.add(i + "11");
//
//
//            System.out.println(arr.toString());
//        }

        }
    }
}
