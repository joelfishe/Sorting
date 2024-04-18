import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * InsertionSorter sorts a collection using Insertion Sort.
 *
 * @param <T> Type of items in the collection to sort.
 * @author Travis Turley & Joel Fisher
 */
    public class InsertionSorter<T extends Comparable<? super T>> implements Sorter<T>
{
    /**
     * Sorts a collection using Insertion Sort.
     *
     * @param collection The collection being sorted.
     * @return A List of the sorted items.
     */
    public List<T> sort(List<T> collection)
    {
        T[] array; // CONVERT COLLECTION TO ARRAY
        array = collection.toArray((T[]) new Comparable[collection.size()]);
        int arraySize = array.length;

        // LOOP OVER ARRAY STARTING FROM THE SECOND ITEM
        for (int i = 1; i < arraySize; i++)
        {
            T currentItem = array[i]; // STORES CURRENT ITEM SO IT CAN BE COMPARED
            int j = i - 1; // INITIALIZE INDEX TO THE ITEM BEFORE CURRENT ITEM

            // MOVE ITEMS IN SORTED ARRAY GREATER THAN THE CURRENT ITEM UP ONE POSITION IN THE LIST
            while (j >= 0 && array[j].compareTo(currentItem) > 0)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = currentItem; // PLACE the CURRENT ITEM AT THE CORRECT POSITION IN ARRAY
        }

        // CONVERT SORTED ARRAY TO SORTED LIST
        return new ArrayList<>(Arrays.asList(array));
    }
}