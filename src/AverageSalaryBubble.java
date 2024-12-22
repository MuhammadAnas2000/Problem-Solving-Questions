import java.util.Arrays;

public class AverageSalaryBubble {
    public static void main(String[] args) {
        int[] arr = {1000,2000,3000};
        sortFromRight(arr);
        double ans = sortFromRight(arr);
        ans = (ans - arr[0] - arr[arr.length-1])/(arr.length-2);
        System.out.print(ans);
    }

    public static int sortFromRight(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j])
                    swap(arr, j - 1, j);
            }
            sum+=arr[i];
        }
        return sum;
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}