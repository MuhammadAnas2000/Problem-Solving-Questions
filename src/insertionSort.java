import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args){
        //int [] arr = {3,1,5,3,2};
        //int [] arr = {4,1,5,10,2};
        int [] arr = {1,2,3,4,5};
        insertionSorting(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void insertionSorting(int [] arr){

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j= i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
}
