package test;

import java.util.Scanner;

public class BeautifulArray {
    
    // Function to perform bubble sort and count swaps in ascending order
    public static int sortAsc(int[] a) {
        int len = a.length;
        int swaps = 0;
        int[] temp = a.clone(); // Copy of the array to avoid modifying the original
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    // Swap adjacent elements
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                    swaps++;
                }
            }
        }
        return swaps;
    }
    
    // Function to perform bubble sort and count swaps in descending order
    public static int sortDesc(int[] a) {
        int len = a.length;
        int swaps = 0;
        int[] temp = a.clone(); // Copy of the array to avoid modifying the original
        
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (temp[j] < temp[j + 1]) {
                    // Swap adjacent elements
                    int t = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = t;
                    swaps++;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Calculate swaps for ascending and descending sorts
        int ascSwaps = sortAsc(arr);
        int descSwaps = sortDesc(arr);
        
        // Print the minimum of the two swap counts
        System.out.println(Math.min(ascSwaps, descSwaps));
        
        sc.close();
    }
}
