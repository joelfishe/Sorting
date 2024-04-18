import java.util.List;

/**
 * Interface for Sorter that sorts list of items from smallest to largest.
 *
 * @param <T extends Comparable> Type of items in the list.
 * @author Travis Turley & Joel Fisher
 */
public interface Sorter<T extends Comparable<? super T>>
{
    /**
     * Sorts a list of items from smallest to largest.
     *
     * @param collection List of items to sort.
     * @return Sorted list of items.
     */
    List<T> sort(List<T> collection);
}