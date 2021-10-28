import java.util.*;

public class MyStringArrayList implements List {

//    ArrayList<String> list = new ArrayList<String>();

//    private static int DEFAULT_SIZE = 16;
    private final static int FACTOR_INCREASE_SIZE = 2;
    private String[] buffer;
    private static final String[] emptyList = new String[0];
    private int mySize;
    private int counter = 0;

    public int getMysize() {
        return mySize;
    }

    public MyStringArrayList (int mysize){
        if (mysize > 0) {
            this.buffer = new String[mysize];
        }
        else {
            if (mysize == 0) {
                this.buffer = emptyList;
            }
        }
    }

    public MyStringArrayList() {
        this.buffer = emptyList;
    }

//    @Override
    public int myArraySize() {
        return this.mySize;
    }

//    private void reallocate(int newSize) {
////
////        String[] newBuffer = new String[newSize];
////        System.arraycopy(buffer, 0, newBuffer, 0, size);
////        buffer = newBuffer;
////
////    }

    public String[] grow() {
        return this.buffer = Arrays.copyOf(this.buffer, mySize *FACTOR_INCREASE_SIZE+1);

    }

    public void add(String element, String[] buffer, int size) {
        if (size == buffer.length) {
            buffer = this.grow();
        }
        buffer[size] = element;
        this.mySize = size + 1;
    }

    public boolean add(String element) {
        this.add(element, this.buffer, this.counter);
        ++this.counter;
        return true;
    }

    //    @Override
//    public boolean add(String element) {
//
//        try{
//            if (size >= buffer.length -1) {
//
//                reallocate(buffer.length * FACTOR_INCREASE_SIZE);
//            }
//            size ++;
//            this.buffer[size] = element;
//            return true;
//        } catch (OutOfMemoryError e) {
//            return false;
//        }
//
//    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0 ? false : true;
    }

    @Override
    public boolean contains(Object o) {

        return this.contains(o) ? false : true;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }


    //    @Override
    public boolean remove(String element) {
        int sizebefore = this.size();
        this.remove(element);
        int sizeafter = this.size();
        return sizeafter == (sizebefore - 1) ? false : true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "MyStringArrayList{" +
                "buffer=" + Arrays.toString(buffer) +
                ", size=" + mySize +
                '}';
    }
}
