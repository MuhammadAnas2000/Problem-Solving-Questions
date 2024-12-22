import java.util.Arrays;

public class RotatedBSTRecursion {
    public static void main(String[] args) {
        //int [] arr = {5,6,7,8,9,1,2,3};
        int [] arr = {5,6,1,2,3,4};
        int target = 3;
        System.out.print(rotatedBST(arr,target,0,arr.length-1));
    }
    public static int rotatedBST(int arr[],int key,int s,int e){

        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return mid+1;
        }
        if(arr[s] <= arr[mid]){
            if(key >= arr[s] && key <= arr[s]){
                return rotatedBST(arr,key,s,mid-1);
            }
            else{
                return rotatedBST(arr,key,mid+1,e);
            }
        }
        if(key >= arr[mid] && key <= arr[e]){
            return rotatedBST(arr,key,mid+1,e);
        }

        return rotatedBST(arr,key,s,mid-1);

    }
}
