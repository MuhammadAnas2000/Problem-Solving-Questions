import java.util.Arrays;

public class BubbleSortWithRecurrsion {
    public static void main(String[] args) {

        int []arr = {3,1,5,4,2};
        bubbleSort(arr,arr.length-1,0,1);
        System.out.print(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[],int len,int i,int j){
        if(i > len ){
            return;
        }
        if(j <= len){
            if(arr[i] > arr[j] ){
                swap(arr,i,j);
            }
            bubbleSort(arr,len,i,++j);
            int a=1;
        }else{
            bubbleSort(arr,len,++i,i+1);
            int a=2;
        }
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
