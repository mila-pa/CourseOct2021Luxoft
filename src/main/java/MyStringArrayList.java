import java.util.*;

public class MyStringArrayList implements List {

//    ArrayList<String> list = new ArrayList<String>();

    private static int DEFAULT_SIZE = 16;
    private static int FACTOR_INCREASE_SIZE = 2;
    private String[] buffer;
    private int pointer;

    public MyStringArrayList(int size) {
        this.buffer = new String[size];
        this.pointer = 0;
    }

    public MyStringArrayList(){
        this(DEFAULT_SIZE);
    }
    @Override
    public int size() {
        return pointer;
    }

    private void reallocate(int newSize) {
        String[] newBuffer = new String[newSize];
        System.arraycopy(buffer, 0, newBuffer, 0, pointer);
        buffer = newBuffer;
    }

    //    @Override
    public boolean add(String str) {
        try{
            if (pointer >= buffer.length -1) {
                reallocate(buffer.length * FACTOR_INCREASE_SIZE);
            }
            this.buffer[pointer] = String.valueOf(0);
            return true;
        } catch (OutOfMemoryError e) {
            return false;
        }

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
        int sizebefore = this.size();
        this.remove("123");
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
                ", pointer=" + pointer +
                '}';
    }
}
