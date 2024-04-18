import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Merge Sort algorithm for sorting a list of elements in ascending order.
 *
 * @param <T> the type of elements in the list must implement the Comparable interface
 */
public class MergeSort<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     * Sorts the given collection using the Merge Sort algorithm.
     *
     * @param collection the collection to be sorted
     * @return a new sorted list containing all elements from the input collection
     */
    public List<T> sort(List<T> collection) {
        // Base case: if the collection has 0 or 1 elements, it is already sorted
        if (collection.size() <= 1)
            return collection;

        // Divide the collection into two halves
        int middle = collection.size() / 2;
        List<T> left = sort(collection.subList(0, middle));
        List<T> right = sort(collection.subList(middle, collection.size()));

        // Merge the sorted halves
        return merge(left, right);
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left  the left sorted list
     * @param right the right sorted list
     * @return a new sorted list containing all elements from the input lists
     */
    private List<T> merge(List<T> left, List<T> right) {
        // Create a new list to store the merged result
        List<T> merged = new ArrayList<>();
        // Pointers to keep track of current positions in both lists
        int leftIndex = 0;
        int rightIndex = 0;

        // Compare elements from both lists and merge them in sorted order
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0) {
                // If an element from a left list is smaller or equal, add it to the merged list
                merged.add(left.get(leftIndex));
                leftIndex++;
            } else {
                // If an element from the right list is smaller, add it to the merged list
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        // Add remaining elements from a left list, if any
        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        // Add remaining elements from the right list, if any
        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }

        // Return the merged sorted list
        return merged;
    }
}
