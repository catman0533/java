// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;

/**
 * homework02_task02
 */
public class homework02_task02 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 6, 1, 3};

        try {
            FileWriter logFile = new FileWriter("log.txt");

            bubbleSort(arr, logFile);

            logFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bubbleSort(int[] arr, FileWriter logFile) throws IOException {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            logFile.write("After iteration " + (i + 1) + ": ");
            printArray(arr, logFile);
        }

        logFile.write("\nSorted array: ");
        printArray(arr, logFile);
    }

    public static void printArray(int[] arr, FileWriter logFile) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            logFile.write(arr[i] + " ");
        }
        logFile.write("\n");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
    


        