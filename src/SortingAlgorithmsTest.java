import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgorithmsTest {

    SortingAlgorithms sort1 = new SortingAlgorithms("100.txt");
    SortingAlgorithms sort2 = new SortingAlgorithms("1k.txt");
    SortingAlgorithms sort3 = new SortingAlgorithms("10k.txt");
    SortingAlgorithms sort4 = new SortingAlgorithms("100k.txt");
    SortingAlgorithms sort5 = new SortingAlgorithms("bestCounting.txt");
    SortingAlgorithms sort6 = new SortingAlgorithms("sameValue.txt");
    SortingAlgorithms sort7 = new SortingAlgorithms("Counting.txt");
    SortingAlgorithms sort8 = new SortingAlgorithms("worst.txt");
    SortingAlgorithms sort9 = new SortingAlgorithms("50k.txt");
    SortingAlgorithms sort10 = new SortingAlgorithms("1M.txt");
    SortingAlgorithms sort11 = new SortingAlgorithms("empty.txt");
    SortingAlgorithms sort12 = new SortingAlgorithms("reverse.txt");
    SortingAlgorithms sort13 = new SortingAlgorithms("sorted.txt");







    @Test
    public void Time_Comparison_counting() {
        long start1 = System.currentTimeMillis();
        sort8.BubbleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort8.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort8.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with large range :");
        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }

    @Test
    public void Time_Comparison_Reversed() {
        long start1 = System.currentTimeMillis();
        sort12.BubbleSort(false);
        ArrayList<int[]> result = sort12.CountingSort(false);
        System.out.println(Arrays.toString(result.get(0)));
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort13.BubbleSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);


        System.out.println("Time to sort the reversed array :");
        System.out.println("\u001B[35mreverse = (" + duration1 + ") ms\u001B[0m");
        System.out.println("Time to sort the sorted array :");
        System.out.println("\u001B[34msorted = (" + duration2 + ") ms\u001B[0m");
    }
    @Test
    public void Time_Comparison_sort1k() {
        long start1 = System.currentTimeMillis();
        sort2.BubbleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort2.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort2.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with 1k :");
        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }


    @Test
    public void Time_Comparison_sort10k() {
        long start1 = System.currentTimeMillis();
        sort3.BubbleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort3.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort3.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with 10k :");
        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }
    @Test
    public void Time_Comparison_sort50k() {
        long start1 = System.currentTimeMillis();
        sort9.BubbleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort9.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort9.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with 50k :");
        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }



    @Test
    public void Time_Comparison_sort100k() {
        long start1 = System.currentTimeMillis();
        sort4.BubbleSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort4.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort4.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with 100k :");
        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }

    @Test
    public void Time_Comparison_sort1m() {
//        long start1 = System.currentTimeMillis();
//        sort10.BubbleSort(false);
//        long end1 = System.currentTimeMillis();
//        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort10.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);

        long start3 = System.currentTimeMillis();
        sort10.CountingSort(false);
        long end3 = System.currentTimeMillis();
        long duration3 = (end3 - start3);
        System.out.println("Time to sort the array with 1M :");
//        System.out.println("\u001B[35m[Bubble Sort] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[Merge Sort] = (" + duration2 + ") ms\u001B[0m");
        System.out.println("\u001B[33m[Counting Sort] = (" + duration3 + ") ms\u001B[0m");
    }

    @Test
//    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void LargeBubble() throws InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            sort10.BubbleSort(false); // Assuming sort10 is properly initialized
        });

        // Assert that the future completes within 5 seconds, otherwise fail the test
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> future.get(5, TimeUnit.SECONDS));


    }

    @Test
//    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void LargeCounting() throws InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            sort8.CountingSort(false);


        });

        // Assert that the future completes within 5 seconds, otherwise fail the test
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> future.get(5, TimeUnit.SECONDS));


    }

    @Test
    public void Test_Bubble_sort() {
        ArrayList<int[]> result = sort1.BubbleSort(false);
        int[] arr = sort1.getarray();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }
    @Test
    public void Test_Merge_sort() {
        ArrayList<int[]> result = sort1.MergeSort(false);
        int[] arr = sort1.getarray();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }
    @Test
    public void Test_Counting_sort() {
        ArrayList<int[]> result = sort1.CountingSort(false);
        int[] arr = sort1.getarray();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }

    @Test
    public void Test_empty() {
        ArrayList<int[]> result = sort11.MergeSort(false);
        int[] arr = sort11.getarray();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }
    @Test
    public void best_worst_merge() {
        long start1 = System.currentTimeMillis();
        sort12.MergeSort(false);
        long end1 = System.currentTimeMillis();
        long duration1 = (end1 - start1);

        long start2 = System.currentTimeMillis();
        sort13.MergeSort(false);
        long end2 = System.currentTimeMillis();
        long duration2 = (end2 - start2);


        System.out.println("Time to sort the array with merge :");
        System.out.println("\u001B[35m[worst case] = (" + duration1 + ") ms\u001B[0m");
        System.out.println("\u001B[34m[best Sort] = (" + duration2 + ") ms\u001B[0m");
    }
    @Test
    public void same() {
        ArrayList<int[]> result = sort6.MergeSort(false);
        int[] arr = sort6.getarray();
        //sorting the array with built-in java sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result.get(0)));
        boolean isEqual = (Arrays.toString(result.get(0)).equals(Arrays.toString(arr)));
        assertTrue(isEqual);
    }



}