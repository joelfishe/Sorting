import java.util.List;

/**
 * The QuickSort class implements the Sorter interface using the Quick Sort algorithm.
 * This class sorts a list of elements in non-decreasing order.
 * @param <T> the type of elements in the list, which must extend Comparable<T>
 */
public class QuickSort<T extends Comparable<? super T>> implements Sorter<T> {

    /**
     * Sorts the given list of elements using the Quick Sort algorithm.
     * This method modifies the original list in-place.
     * @param collection the list of elements to be sorted
     * @return the sorted list
     */
    public List<T> sort(List<T> collection) {
        quickSort(collection, 0, collection.size() - 1);
        return collection;
    }

    /**
     * Recursively sorts a portion of the list using the Quick Sort algorithm.
     * @param collection the list of elements to be sorted
     * @param low the index of the first element of the portion to be sorted
     * @param high the index of the last element of the portion to be sorted
     */
    private void quickSort(List<T> collection, int low, int high) {
        if (low < high) {
            int pi = partition(collection, low, high);
            quickSort(collection, low, pi - 1);
            quickSort(collection, pi + 1, high);
        }
    }

    /**
     * Partitions the list around a pivot element for the Quick Sort algorithm.
     * @param collection the list of elements to be partitioned
     * @param low the index of the first element of the portion to be partitioned
     * @param high the index of the last element of the portion to be partitioned
     * @return the index of the pivot element after partitioning
     */
    private int partition(List<T> collection, int low, int high) {
        T pivot = collection.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (collection.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(collection, i, j);
            }
        }
        swap(collection, i + 1, high);
        return i + 1;
    }

    /**
     * Swaps two elements in the list.
     * @param collection the list containing the elements to be swapped
     * @param i the index of the first element to be swapped
     * @param j the index of the second element to be swapped
     */
    private void swap(List<T> collection, int i, int j) {
        T temp = collection.get(i);
        collection.set(i, collection.get(j));
        collection.set(j, temp);
    }
}
