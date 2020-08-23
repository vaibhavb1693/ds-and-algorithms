package com.trees;

public class BuildMaxHeap {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10,
                9, 8, 15, 17 };
        int n = arr.length;
        buildHeap(arr, n);
        printHeap(arr, n);

    }

    public static void buildHeap(int[] arr, int n){
        //Last non-leaf node = parent of last-node.
        //Last non-leaf node = Node at index ((n-1) - 1)/2. = n/2 - 1
        int startIndex = n/2 -1;
        for (int i = startIndex; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            int swap = arr[i];
            arr[i] =  arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }

    }
    static void printHeap(int arr[], int n)
    {
        System.out.println("Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

