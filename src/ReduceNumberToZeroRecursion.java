public class ReduceNumberToZeroRecursion {
    public static void main(String[] args) {
        int n = 123;
        System.out.print(numberOfSteps(n));
    }

    public static int numberOfSteps(int nums){
        int count = 0;
        return helper(nums,0);
    }

    public static int helper(int n ,int count){
        if(n ==0){
            return count;
        }
        if(n %2 == 0 ){
            ++count;
          return  helper(n/2,count);
        }
        else {
            ++count;
           return helper(n-1,count);
        }
    }
}
