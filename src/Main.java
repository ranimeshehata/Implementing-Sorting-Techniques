import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String path;
    static int method;
    static Boolean intermediate;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<int[]> sortedArrayIntermediate = new ArrayList<int[]>();

    public static void readInput(){
        System.out.println("Choose a method or exit the program:\n1-Bubble sort\n2-Merge sort\n3-Counting sort\n0-Exit");
        method=sc.nextInt();
        System.out.println("Choose whether you want to see the intermediate arrays or not.(true or false)");
        intermediate=sc.nextBoolean();
    }
    public static void printArrays(){

        for (int[] array : sortedArrayIntermediate) {
            // Print each element of the current array
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line for the next array
        }

    }
    public static void main(String[] args) {

        System.out.println("Enter the file path.");
        path = sc.nextLine();
        SortingAlgorithms sort = new SortingAlgorithms(path);
        readInput();
        while(method!=0)
        {
            if(method==1){
                sortedArrayIntermediate=sort.BubbleSort(intermediate);
            }
            else if(method==2){
                sortedArrayIntermediate=sort.MergeSort(intermediate);

        }
            else{
                sortedArrayIntermediate=sort.CountingSort(intermediate);
            }
            printArrays();
            readInput();
        }

    }
}