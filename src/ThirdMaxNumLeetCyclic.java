import java.util.Arrays;

public class ThirdMaxNumLeetCyclic {
    public static void main(String[] args){
        int [] arr = {2,2,3,1};
        System.out.print(thirdMaxVal(arr));

}

    public static int thirdMaxVal(int [] nums){
        Integer sencondMax= null;
        Integer thirdMax= null;
        Integer temp=0;
        Integer max = nums[0];
            for(int i =0;i<nums.length;i++) {
                    if((max == nums[i]  || (sencondMax != null && sencondMax == nums[i]) || (thirdMax != null && thirdMax == nums[i]))){
                        continue;
                    }
                    if(nums[i] > max) {
                        thirdMax = sencondMax;
                        sencondMax = max;
                        max = nums[i];
                    }
                    else if(sencondMax == null || nums[i] > sencondMax && i !=0 ) {
                        temp = sencondMax;
                        sencondMax = nums[i];
                        thirdMax = temp;
                    } else if (thirdMax == null || thirdMax < nums[i] && i !=0) {
                        thirdMax = nums[i];
                    }
            }
            return  thirdMax != null ? thirdMax : max ;
    }
}
