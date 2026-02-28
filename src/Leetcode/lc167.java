package Leetcode;
import java.util.Arrays;
public class lc167 {
    public int[] twoSum(int[] numbers,int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];


            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            } ;

        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {

        lc167 obj = new lc167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(result));

    }



}
