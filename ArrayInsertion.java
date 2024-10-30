import java.util.ArrayList;
import java.util.List;

public class ArrayInsertion {
    
    // Insert at the beginning of the array
    public static List<Integer> insertAtBeginning(List<Integer> array, int element) {
        array.add(0, element);
        return array;
    }

    // Insert at the end of the array
    public static List<Integer> insertAtEnd(List<Integer> array, int element) {
        array.add(element);
        return array;
    }

    // Insert at a specific position
    public static List<Integer> insertAtPosition(List<Integer> array, int element, int position) {
        if (position >= 0 && position <= array.size()) {
            array.add(position, element);
        } else {
            System.out.println("Invalid position");
        }
        return array;
    }

    public static void main(String[] args) {
        // Initialize array
        List<Integer> array = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Original Array: " + array);
        
        // Insert elements
        insertAtBeginning(array, 6);
        System.out.println("After inserting at beginning: " + array);

        insertAtEnd(array, 7);
        System.out.println("After inserting at end: " + array);

        insertAtPosition(array, 8, 4);
        System.out.println("After inserting at position 4: " + array);
    }
}
