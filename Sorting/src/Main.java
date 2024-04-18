import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This class demonstrates the performance of various sorting algorithms
 * (QuickSort, MergeSort, and InsertionSort) using different array sizes.
 */
public class Main {
    private static MergeSort mergeSort = new MergeSort();
    private static QuickSort quickSort = new QuickSort();
    private static InsertionSorter insertionSorter = new InsertionSorter();



    /**
     * The main method to initiate the sorting algorithm performance tests.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] hundred = new int[100000];
        int[] eighty = new int[80000];
        int[] sixty = new int[60000];
        int[] forty = new int[40000];
        int[] twenty = new int[20000];
        fillArrayWithRandomIntegers(hundred, rand);
        fillArrayWithRandomIntegers(eighty, rand);
        fillArrayWithRandomIntegers(sixty, rand);
        fillArrayWithRandomIntegers(forty, rand);
        fillArrayWithRandomIntegers(twenty, rand);
        SorterList SorterMerge100 = new SorterList<>(Collections.singletonList(hundred),mergeSort);
        SorterList SorterMerge80 = new SorterList<>(Collections.singletonList(eighty), mergeSort);
        SorterList SorterMerge60 = new SorterList<>(Collections.singletonList(sixty),mergeSort);
        SorterList SorterMerge40 = new SorterList<>(Collections.singletonList(forty),mergeSort);
        SorterList SorterMerge20 = new SorterList<>(Collections.singletonList(twenty), mergeSort);
        SorterList SorterQuick100 = new SorterList<>(Collections.singletonList(hundred),quickSort);
        SorterList SorterQuick80 = new SorterList<>(Collections.singletonList(eighty),mergeSort);
        SorterList SorterQuick60 = new SorterList<>(Collections.singletonList(sixty), quickSort);
        SorterList SorterQuick40 = new SorterList<>(Collections.singletonList(forty),quickSort);
        SorterList SorterQuick20 = new SorterList<>(Collections.singletonList(twenty),quickSort);
        SorterList SorterInsertion100 = new SorterList<>(Collections.singletonList(hundred),insertionSorter);
        SorterList SorterInsertion80 = new SorterList<>(Collections.singletonList(eighty),insertionSorter);
        SorterList SorterInsertion60 = new SorterList<>(Collections.singletonList(sixty),insertionSorter);
        SorterList SorterInsertion40 = new SorterList<>(Collections.singletonList(forty),insertionSorter);
        SorterList SorterInsertion20 = new SorterList<>(Collections.singletonList(twenty),insertionSorter);

        long merge100Start = System.currentTimeMillis();
        List merge100 = SorterMerge100.sort();
        long merge100End = System.currentTimeMillis();
        printExecutionTime("Merge Sort (100)", merge100Start, merge100End);

        long merge80Start = System.currentTimeMillis();
        List merge80 = SorterMerge80.sort();
        long merge80End = System.currentTimeMillis();
        printExecutionTime("Merge Sort (80)", merge80Start, merge80End);

        long merge60Start = System.currentTimeMillis();
        List merge60 = SorterMerge60.sort();
        long merge60End = System.currentTimeMillis();
        printExecutionTime("Merge Sort (60)", merge60Start, merge60End);

        long merge40Start = System.currentTimeMillis();
        List merge40 = SorterMerge40.sort();
        long merge40End = System.currentTimeMillis();
        printExecutionTime("Merge Sort (40)", merge40Start, merge40End);

        long merge20Start = System.currentTimeMillis();
        List merge20 = SorterMerge20.sort();
        long merge20End = System.currentTimeMillis();
        printExecutionTime("Merge Sort (20)", merge20Start, merge20End);

        // Sort and measure time for Quick Sort
        long quick100Start = System.currentTimeMillis();
        List quick100 = SorterQuick100.sort();
        long quick100End = System.currentTimeMillis();
        printExecutionTime("Quick Sort (100)", quick100Start, quick100End);

        long quick80Start = System.currentTimeMillis();
        List quick80 = SorterQuick80.sort();
        long quick80End = System.currentTimeMillis();
        printExecutionTime("Quick Sort (80)", quick80Start, quick80End);

        long quick60Start = System.currentTimeMillis();
        List quick60 = SorterQuick60.sort();
        long quick60End = System.currentTimeMillis();
        printExecutionTime("Quick Sort (60)", quick60Start, quick60End);

        long quick40Start = System.currentTimeMillis();
        List quick40 = SorterQuick40.sort();
        long quick40End = System.currentTimeMillis();
        printExecutionTime("Quick Sort (40)", quick40Start, quick40End);

        long quick20Start = System.currentTimeMillis();
        List quick20 = SorterQuick20.sort();
        long quick20End = System.currentTimeMillis();
        printExecutionTime("Quick Sort (20)", quick20Start, quick20End);

        // Sort and measure time for Insertion Sort
        long ins100Start = System.currentTimeMillis();
        List ins100 = SorterInsertion100.sort();
        long ins100End = System.currentTimeMillis();
        printExecutionTime("Insertion Sort (100)", ins100Start, ins100End);

        long ins80Start = System.currentTimeMillis();
        List ins80 = SorterInsertion80.sort();
        long ins80End = System.currentTimeMillis();
        printExecutionTime("Insertion Sort (80)", ins80Start, ins80End);

        long ins60Start = System.currentTimeMillis();
        List ins60 = SorterInsertion60.sort();
        long ins60End = System.currentTimeMillis();
        printExecutionTime("Insertion Sort (60)", ins60Start, ins60End);

        long ins40Start = System.currentTimeMillis();
        List ins40 = SorterInsertion40.sort();
        long ins40End = System.currentTimeMillis();
        printExecutionTime("Insertion Sort (40)", ins40Start, ins40End);

        long ins20Start = System.currentTimeMillis();
        List ins20 = SorterInsertion20.sort();
        long ins20End = System.currentTimeMillis();
        printExecutionTime("Insertion Sort (20)", ins20Start, ins20End);
    }

    public static void printExecutionTime(String sortType, long start, long end) {
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println(sortType + " - Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
    /**
     * Fills the given array with random integers.
     *
     * @param array The array to be filled with random integers.
     * @param rand  The Random object used to generate random integers.
     */
    private static void fillArrayWithRandomIntegers(int[] array, Random rand) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(99999);
        }
    }
}

