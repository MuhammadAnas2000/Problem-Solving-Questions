import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int [] arr = {3,1,5,4,2};
        selectionSorting(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void selectionSorting(int [] arr){
        for(int i=0;i<arr.length;i++){
           int index = findMax(arr,arr.length-i);
           swap(arr,index,arr.length-i-1);
        }
    }
    public static int findMax(int [] arr,int size){
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
