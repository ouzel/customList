public class Main {
    public static void main(String[] args) {
        IntegerList list = new CustomIntegerList();
        System.out.println(list.size());
        list.add(1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(4);
        list.add(2, 5);
        list.add(6);
        list.add(3, 7);
        ((CustomIntegerList) list).print();
        list.remove((Integer) 1);
        ((CustomIntegerList) list).print();
        list.remove(1);
        ((CustomIntegerList) list).print();
        System.out.println(list.size());
        System.out.println(list.contains(7));
        System.out.println(list.contains(100));
        System.out.println(list.contains(-2));
        try {
            list.add(100, 123);
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}