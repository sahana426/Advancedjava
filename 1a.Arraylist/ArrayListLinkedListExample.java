package ArrayList1;

import java.util.*;

public class ArrayListLinkedListExample {
    public static void main(String[] args) {
        // Creating ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // 1. Adding elements (Apple, Banana, Orange)
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements
        arrayList.addAll(Arrays.asList("Mango", "Pineapple"));
        linkedList.addAll(Arrays.asList("Mango", "Pineapple"));

        // 4. Accessing elements
        System.out.println("Accessing 2nd element from ArrayList: " + arrayList.get(1));
        System.out.println("Accessing 2nd element from LinkedList: " + linkedList.get(1));

        // 5. Updating elements
        arrayList.set(0, "Strawberry");  // Update "Apple" to "Strawberry"
        linkedList.set(0, "Strawberry"); // Update "Apple" to "Strawberry"
        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("Updated LinkedList: " + linkedList);

        // 6. Removing elements
        arrayList.remove("Banana"); // Remove "Banana"
        linkedList.remove("Banana"); // Remove "Banana"
        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);

        // 7. Searching elements
        System.out.println("ArrayList contains 'Orange': " + arrayList.contains("Orange"));
        System.out.println("LinkedList contains 'Mango': " + linkedList.contains("Mango"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over the list
        System.out.println("Iterating over ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("Iterating over LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator on ArrayList:");
        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("Using Iterator on LinkedList:");
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        // 11. Sorting the lists
        Collections.sort(arrayList); // Sort the ArrayList
        Collections.sort(linkedList); // Sort the LinkedList
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist (get 1st and 2nd elements from ArrayList)
        List<String> subList = arrayList.subList(0, 2);
        System.out.println("Sublist of ArrayList: " + subList);

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
