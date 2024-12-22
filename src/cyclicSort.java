import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args){
        int [] arr = {3,5,2,1,4};
        cyclicSorting(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void cyclicSorting(int[] arr){
        int i=0;

        while(i<arr.length){
            int correct = i+1;
            if(arr[i]!=correct){
                swap(arr,i,arr[i]-1);
            }
            else{
                ++i;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
