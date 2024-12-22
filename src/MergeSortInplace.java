import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        //int arr[] = {4,2,6,10,7,3};
        //int arr[] = {4,2,6};
        int arr[] = {15,7,4,2,5};
        inPlaceMerge(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }

    public static void inPlaceMerge(int arr[],int s,int e){

        if(e-s == 1){
            return;
        }
        //int mid = s+(e-s)/2;
        int mid = (s+e)/2;
        inPlaceMerge(arr,s,mid);
        inPlaceMerge(arr,mid,e);

        inPlaceMerging(arr,s,mid,e);
    }

    public static void inPlaceMerging(int arr[],int s,int m,int e){
        int[] ans = new int[e-s];
        int i=s;
        int j =m;
        int k =0;

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                //ans[k] = arr[i];
                arr[s+k] = arr[i];
                ++i;
            }else{
               // ans[k] = arr[j];
                arr[s+k] = arr[j];
                ++j;
            }
            ++k;
        }

        while(i < m){
            ans[k] = arr[i];
            ++i;
            ++k;
        }
        while(j < e){
            ans[k] = arr[j];
            ++j;
            ++k;
        }

        for(int l=0;l<ans.length;l++){
            arr[s+l] = ans[l];
        }
    }
}
