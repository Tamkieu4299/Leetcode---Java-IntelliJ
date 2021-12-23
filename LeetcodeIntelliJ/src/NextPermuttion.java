import java.util.Arrays;

public class NextPermuttion {
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int index = 0;
        for (int i = len - 1; i >= 1; i--) {
            if (i > i - 1) {
                index = i;
                System.out.println(index);
                break;
            }
        }
        int milestone = nums[index];

        int index_change = 0;
        for (int i = index + 2; i < len; i++) {
            index_change = nums[i] <= nums[i - 1] && nums[i] >= milestone ? i : i - 1;
        }

        int temp = 0;
        temp = nums[index_change];
        nums[index_change] = nums[index];
        nums[index] = temp;
        Arrays.sort(nums, index + 1, len);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 4, 9, 7, 6 };
        nextPermutation(nums);

    }
}
