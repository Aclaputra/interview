package com.problem.java;
// Java program for the
// stooge sort
class SlowestKeyPress{
     
    // Function to implement
    // stooge sort
    static void stoogesort(int arr[],
                           int l, int h)
    {
      // Base Case
      if (l >= h)
        return;
     
      // If first element is smaller
      // than last element, swap them
      if (arr[l] > arr[h])
      {
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
      }
     
      // If there are more than
      // 2 elements in the array
      if (h - l + 1 > 2)
      {
        int t = (h - l + 1) / 3;
     
        // Recursively sort the
        // first 2/3 elements
        stoogesort(arr, l, h - t);
     
        // Recursively sort the
        // last 2/3 elements
        stoogesort(arr, l + t, h);
     
        // Recursively sort the
        // first 2/3 elements again
        stoogesort(arr, l, h - t);
      }
    }
     
    // Driver Code
    public static void main(String[] args)
    {
      int arr[] = {2, 4, 5, 3, 1};
      int N = arr.length;
     
      // Function Call
      stoogesort(arr, 0, N - 1);
     
      // Display the sorted array
      for (int i = 0; i < N; i++)
      {
        System.out.print(arr[i] + " ");
      }
    }
}
