import com.sun.org.apache.xpath.internal.objects.XString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class MyStringArrayListMain {

    public static void main(String[] args) {
        int arraySize = 6;
        ArrayList<String> test = new ArrayList<>(6);
//        MyStringArrayList arr = new MyStringArrayList(3);
        MyStringArrayList arr = new MyStringArrayList(arraySize);
//        int myArraySize = arr.myArraySize();
        System.out.println("size = " + arr.getMysize());
//        arr.add("111");
//        arr.add("222");
//        arr.add("333");
//        arr.add("444");
//        arr.add("555");
//        arr.add("666");
        System.out.println(arr);
        for (int i = 0; i <= arraySize; i++) {
            arr.add(i + "element");
            System.out.println(arr.toString());
        }
    }
}

