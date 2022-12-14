import java.util.Arrays;

public class Section54Sorter{
    
    static void sort(int[] arr){
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] > arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] arr = {1,0,2,7,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Silly");
    }
}