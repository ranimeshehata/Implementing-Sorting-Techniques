import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;

public class SortingAlgorithms {
    private final String path;
    private int[] sortArray;
    private ArrayList<Integer> arr = new ArrayList<>();

    public SortingAlgorithms(String path) {
        this.path = path;
        readFile(path);
    }

    private void readFile(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader("cases/" + path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strArray = line.split(",");
                for (int i = 0; i < strArray.length; i++) {
                    arr.add(Integer.parseInt(strArray[i]));
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR Opening File!");
            exit(0);
        }
        this.sortArray = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++)
            this.sortArray[i] = arr.get(i);
    }

    public int[] getarray() {
        int[] intArray = new int[arr.size()];

        // Copy elements from the ArrayList to the int[] array
        for (int i = 0; i < arr.size(); i++) {
            intArray[i] = arr.get(i);
        }

        return intArray;
    }

    // Simple sort algorithm
    public ArrayList<int[]> BubbleSort(boolean intermediateSteps) {
        ArrayList<int[]> sortedArrayIntermediate = new ArrayList<int[]>();
        int n = sortArray.length;
        if (intermediateSteps) {
            sortedArrayIntermediate.add(Arrays.copyOf(sortArray, n));
        }
        for (int i = 0; i < n - 1; i++) {
            int flagSorted = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    flagSorted = 1;
                    // swap arr[j+1] and arr[i]
                    int temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                }
                if (intermediateSteps) {
                    sortedArrayIntermediate.add(Arrays.copyOf(sortArray, n));
                }
            }
            if (flagSorted == 0) {
                break;
            }
        }
        if (!intermediateSteps) {
            sortedArrayIntermediate.add(Arrays.copyOf(sortArray, n));
        }
        return sortedArrayIntermediate;
    }

    // Efficient sort algorithm
    public ArrayList<int[]> MergeSort(boolean intermediateSteps) {
        ArrayList<int[]> sortedArrayIntermediate = new ArrayList<int[]>();
        int n = sortArray.length;
        int[] tempArray = new int[n];
        if (intermediateSteps) {
            sortedArrayIntermediate.add(Arrays.copyOf(sortArray, n));
        }
        sort(sortArray, tempArray, 0, n - 1, sortedArrayIntermediate, intermediateSteps);
        if (!intermediateSteps) {
            sortedArrayIntermediate.add(Arrays.copyOf(sortArray, n));
        }
        return sortedArrayIntermediate;
    }

    private void sort(int[] arr, int[] temp, int l, int r, ArrayList<int[]> sortedArrayIntermediate,
                      boolean intermediateSteps) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, temp, l, m, sortedArrayIntermediate, intermediateSteps);
            sort(arr, temp, m + 1, r, sortedArrayIntermediate, intermediateSteps);
            merge(arr, temp, l, m, r, sortedArrayIntermediate, intermediateSteps);
        }
    }

    private void merge(int[] arr, int[] temp, int l, int m, int r, ArrayList<int[]> sortedArrayIntermediate,
                       boolean intermediateSteps) {
        for (int i = l; i <= r; i++) {
            temp[i] = arr[i];
        }

        int i = l;
        int j = m + 1;
        int k = l;

        while (i <= m && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            arr[k] = temp[i];
            k++;
            i++;
        }

        while (j <= r) {
            arr[k] = temp[j];
            k++;
            j++;
        }
        if (intermediateSteps) {
            sortedArrayIntermediate.add(Arrays.copyOf(arr, arr.length));
        }
    }

    // Non-comparison sort algorithm
    public ArrayList<int[]> CountingSort(boolean intermediateSteps) {
        ArrayList<int[]> sortedArrayintermdediate = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        int minVal=Integer.MAX_VALUE;
        int n = sortArray.length;
        int[] copy = new int[sortArray.length];
        for (int i = 0; i < n; i++) {
            if (sortArray[i] > maxVal) {
                maxVal = sortArray[i];
            }
            if(sortArray[i]<minVal){
                minVal=sortArray[i];
            }
        }
        int range= maxVal-minVal+1;
        int[] frequencyTable = new int[maxVal-minVal + 1];

        for (int i = 0; i < n; i++) {
            frequencyTable[sortArray[i]-minVal]++;
        }

        for (int i=1;i<range;i++) {
            frequencyTable[i] = frequencyTable[i - 1] + frequencyTable[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            copy[frequencyTable[sortArray[i]-minVal] - 1] = sortArray[i];
            frequencyTable[sortArray[i]-minVal]--;
            if (intermediateSteps) {
                sortedArrayintermdediate.add(Arrays.copyOf(copy, sortArray.length));
            }
        }
        if (!intermediateSteps) {
            sortedArrayintermdediate.add(Arrays.copyOf(copy, sortArray.length));
        }

        return sortedArrayintermdediate;
    }
}
