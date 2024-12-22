import java.util.ArrayList;
import java.util.List;

public class iterativeSubjetDublicate {
    public static void main(String[] args) {
        int arr[]={1,2,2};
        List<List<Integer>> ans = dublicateSubset(arr);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }

    public static List<List<Integer>> dublicateSubset(int arr[]){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int prevNum = Integer.MIN_VALUE;
        int count = -1;
        for(int num : arr){
            int n = outer.size();

            for(int i=0; i<n;i++){
                if(num != prevNum || Math.pow(2, count) <= i) {
                    List<Integer> inner = new ArrayList<>(outer.get(i));
                    inner.add(num);
                    outer.add(inner);
                }
            }
            prevNum = num;
            ++count;
        }
        return outer;
    }
}
