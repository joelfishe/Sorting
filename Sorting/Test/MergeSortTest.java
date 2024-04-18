import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void testIntegerSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        List<Integer> unsortedIntegers = Arrays.asList(5, 3, 8, 2, 1, 9, 4, 7, 6);
        List<Integer> sortedIntegers = mergeSort.sort(new ArrayList<>(unsortedIntegers));

        List<Integer> expectedSortedIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertEquals(expectedSortedIntegers, sortedIntegers);
    }
}
