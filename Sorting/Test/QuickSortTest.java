import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortTest {

    @Test
    public void testQuickSortWithUnsortedList() {
        // Create an instance of QuickSort
        QuickSort<Integer> quickSort = new QuickSort<>();

        // Test with an unsorted list
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));
        List<Integer> sortedList = quickSort.sort(unsortedList);
        List<Integer> expectedList = Arrays.asList(1, 2, 5, 5, 6, 9);
        Assertions.assertEquals(expectedList, sortedList);
    }

    @Test
    public void testQuickSortWithSortedList() {
        // Create an instance of QuickSort
        QuickSort<Integer> quickSort = new QuickSort<>();

        // Test with an already sorted list
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> sortedList = quickSort.sort(unsortedList);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(expectedList, sortedList);
    }

    @Test
    public void testQuickSortWithReverseSortedList() {
        // Create an instance of QuickSort
        QuickSort<Integer> quickSort = new QuickSort<>();

        // Test with a reverse sorted list
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
        List<Integer> sortedList = quickSort.sort(unsortedList);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(expectedList, sortedList);
    }

    @Test
    public void testQuickSortWithEmptyList() {
        // Create an instance of QuickSort
        QuickSort<Integer> quickSort = new QuickSort<>();

        // Test with an empty list
        List<Integer> unsortedList = new ArrayList<>();
        List<Integer> sortedList = quickSort.sort(unsortedList);
        List<Integer> expectedList = new ArrayList<>();
        Assertions.assertEquals(expectedList, sortedList);
    }

    @Test
    public void testQuickSortWithSingleElementList() {
        // Create an instance of QuickSort
        QuickSort<Integer> quickSort = new QuickSort<>();

        // Test with a list containing only one element
        List<Integer> unsortedList = new ArrayList<>(List.of(42));
        List<Integer> sortedList = quickSort.sort(unsortedList);
        List<Integer> expectedList = List.of(42);
        Assertions.assertEquals(expectedList, sortedList);
    }
}
