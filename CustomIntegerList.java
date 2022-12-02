import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CustomIntegerList implements IntegerList {
    ArrayList<Integer> list;

    public CustomIntegerList() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return (list.size() == 0);
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) throw new NullPointerException();
        if (Integer.class != o.getClass()) throw new ClassCastException();
        for (Integer element : list) {
            if (Objects.equals(o, element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        return list.get(index);
    }

    @Override
    public void add(int index, Integer element) {
        if (element == null) throw new NullPointerException();
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException();
        try {
            list.add(index, element);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        return list.remove(index);
    }

    @Override
    public int indexOf(Integer o) {
        if (o == null) throw new NullPointerException();
        if (list.contains(o)) return list.indexOf(o);
        return -1;
    }

    @Override
    public boolean add(Integer e) {
        if (e == null) throw new NullPointerException();
        try {
            list.add(list.size(), e);
            return true;
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean remove(Integer o) {
        if (o == null) throw new NullPointerException();
        if (list.contains(o)) {
            list.remove(o);
            return true;
        }
        return false;
    }

    /**
     * Method for printing the elements of the list.
     */
    public void print() {
        for (Integer el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
