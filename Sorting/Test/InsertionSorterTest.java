import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Test class for InsertionSorter
 *
 * @author Travis Turley & Joel Fisher
 */
public class InsertionSorterTest
{
    @Test
    public void testSort()
    {
        Sorter<Integer> sorter = new InsertionSorter<>();

        // TEST EMPTY LIST
        List<Integer> emptyList = new ArrayList<>();
        assertEquals(Collections.emptyList(), sorter.sort(emptyList));

        // TEST LIST WITH ONLY ONE ITEM
        List<Integer> oneItemList = new ArrayList<>(List.of(1));
        assertEquals(List.of(1), sorter.sort(oneItemList));

        // TEST LIST THAT'S ALREADY SORTED
        List<Integer> sortedList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(1, 2, 3, 4, 5), sorter.sort(sortedList));

        // TEST REVERSE SORTED LIST
        List<Integer> reverseSortedList = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        assertEquals(List.of(1, 2, 3, 4, 5), sorter.sort(reverseSortedList));

        // TEST UNSORTED LIST
        List<Integer> unsortedList = new ArrayList<>(List.of(3, 1, 5, 2, 4));
        assertEquals(List.of(1, 2, 3, 4, 5), sorter.sort(unsortedList));

        // TEST UNSORTED LIST WITH DUPLICATES
        List<Integer> duplicateList = new ArrayList<>(List.of(3, 1, 5, 2, 4, 3, 5));
        assertEquals(List.of(1, 2, 3, 3, 4, 5, 5), sorter.sort(duplicateList));
    }
}