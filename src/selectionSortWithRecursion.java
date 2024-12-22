import java.util.Arrays;

public class selectionSortWithRecursion {
    public static void main(String[] args) {
       int arr[] = {3,1,5,4,2};
        //int arr[] = {3};
        selectionSortRecursion(arr,arr.length-1,1,0);
        System.out.print(Arrays.toString(arr));
    }

    public static void selectionSortRecursion(int arr[],int len,int j,int max){
        if(0 >= len){
            return;
        }
        if(j <= len){
            if(arr[j] > arr[max]){
                max = j;
            }
            selectionSortRecursion(arr,len,++j,max);
        }
        else{
            swap(arr,max,len);
            selectionSortRecursion(arr,--len,1,0);
        }
    }

    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
