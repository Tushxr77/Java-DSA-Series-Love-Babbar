import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        // System.out.println(list);

        // Remove
        list.remove(0);
        // System.out.println(list);

        // AddAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(53);
        list2.add(43);
        list2.add(63);
        list2.add(83);

        // Getter & Setter
        List<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(58);
        list3.add(86);
        list3.add(82);

        // System.out.println("Getter " + list3.get(0)); // Fetching the data
        // System.out.println("Before set " + list3);
        // list3.set(0, 12); // Change the element by set method
        // System.out.println("After set " + list3);

        // To Array --> Change the collection into an array
        Object[] krr = list3.toArray();

        for (Object obj : krr) {
            System.out.println(" " + obj);
        }

        // Contains --> Check whether the element is present or not
        System.out.println(list3.contains(58));

        // Add All
        list.addAll(list2);
        // System.out.println(list);

        // Remove All
        list.removeAll(list2);
        // System.out.println(list);

        // List Size
        // System.out.println(list.size());

        // Iterate the list using Iterator
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println("Elements: " + itr.next());
        }

        // Sort --> Sorting the elements in ascending or descending order
        list.add(12);
        list.add(6);

        System.out.println("New list " + list);

        // Ascending order
        Collections.sort(list);
        System.out.println("Sorting list " + list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order " + list);

        // Clone
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        ArrayList<Integer> newlist = (ArrayList<Integer>) list1.clone();

        // Ensure Capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // Empty --> Check whether the list is empty or not
        System.out.println(newlist.isEmpty());

        // Index --> Check the index of an element
        System.out.println(list.indexOf(20));
    }
}
