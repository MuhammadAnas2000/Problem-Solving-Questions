import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int [] arr = {3,4,5,6,7,8,9};
        System.out.print(BS(arr,7));
    }

    static int BS(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid = start +(end - start)/2;
            
            if(arr[mid] == n){
                return mid+1;
            } else if (arr[mid]>n) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
