public class SearchInsertBST {
    public static void main(String[] args){
        int [] arr = {1,3,5,6};
        System.out.print(searchInsert(arr,7));
    }

    static int searchInsert(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid = start +(end - start)/2;

            if(arr[mid] == n){
                return mid;
            } else if (arr[mid]>n) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
