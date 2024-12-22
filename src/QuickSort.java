import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {10,7,8,9,1,5};
        quickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int low,int high){

        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        while(s<e){

            while(arr[s] < pivot){
                ++s;
            }
            while(arr[e] > pivot){
                --e;
            }
            if(s <e){
                swap(arr,s,e);
            }
        }
        ++s;
        --e;
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
