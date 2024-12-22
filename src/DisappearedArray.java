import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DisappearedArray {
    private int i;
    public  void main(String[] args){
        int [] arr = {4,3,2,7,8,2,3,1};
        //int [] arr = {1,1};
        //System.out.print(cyclicSorting(arr));
        //System.out.print(Arrays.toString(arr));
        System.out.print(i);
    }

    public static List<Integer> cyclicSorting(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = i+1;
            if(arr[i]!=correct && arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else{
                ++i;
            }
        }
        return IntStream.range(0, arr.length)
                .filter(j -> arr[j] != j+1)
                .mapToObj(j -> j+1)
                .collect(Collectors.toList());
    }
    public static void swap(int[] arr, int i, int j){

        int temp =arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
