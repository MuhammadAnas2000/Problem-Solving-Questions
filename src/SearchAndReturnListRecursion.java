import java.util.ArrayList;

public class SearchAndReturnListRecursion {
    public static void main(String[] args) {
        int [] arr = {5,3,1,2,3,4};
        int target = 3;
        System.out.print( printList(arr,target,0));
    }

    public static ArrayList printList(int arr[],int target,int index){

        ArrayList list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
           list.add((index+1));
        }
            ArrayList backListFromStack = printList(arr,target,++index);
            if(list.size() > 0 ){
                backListFromStack.addAll(list);
            }
            return backListFromStack;
    }
}
