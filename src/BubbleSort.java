import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int [] arr = {3,1,5,4,2};
        sortFromLeft(arr);
        //sortFromRight(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void sortFromRight(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1] > arr[j])
                    swap(arr,j-1,j);
            }
        }
    }
    public static void sortFromLeft(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                    swap(arr,i,j);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
