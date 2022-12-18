package Lab3;

import java.util.Arrays;

class Lab3 {
      // Linear Search for 1d Array
    public int LinearSearch1D(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Linear Search for 2d Array
    public int[] LinearSearch2D(int arr[][],int key){
        int sub[] = new int[2]; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    sub[0] = i;
                    sub[1] = j;
                    return sub;
                }
            }
        }
        return null;
    }
    
      // Binary Search for 1d Array
    public int BinarySearch1D(int arr[],int key){
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;
        int mid;
        while (first<=last) {
            mid = (first+last)/2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                first = mid+1;
            } 
            else if(arr[mid] > key){
                last = mid-1;
            }
            
        }
        
        return -1;
    }

      // Binary Search for 2d Array
    public int[] BinarySearch2D(int arr[][],int key){
        int sub[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            int first = 0;
            int last = arr[i].length-1;
            int mid;

            while (first<=last) {

                mid = (first+last)/2;
            if (arr[i][mid] == key) {
                sub[0] = i;
                sub[1] = mid;
                return sub;
            }
            else if (arr[i][mid] < key) {
                first = mid+1;
            } 
            else if(arr[i][mid] > key){
                last = mid-1;
            }
            
        }
    }
        
        return null;
    }
}
