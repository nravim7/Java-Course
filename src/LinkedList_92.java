import java.util.LinkedList;

public class LinkedList_92 {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(6);


        l1.add(6);
        l1.add(0,7);
        l1.add(0,8);
        l1.add(9);
        l1.addAll(l2);

        l1.addLast(8);
        l1.addLast(555);
        l1.addFirst(888);

        l1.clone();
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(15));
        //System.out.println(l1);
        for (Integer integer : l1) {
            System.out.print(integer);
            System.out.print(", ");
        }
    }
}
