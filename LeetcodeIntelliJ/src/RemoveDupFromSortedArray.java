import java.util.*;

public class RemoveDupFromSortedArray {
//    public static int removeDuplicates(int[] nums) {
//        int len = nums.length;
//        for(int i=1; i<nums.length; i++){
//            if(nums[i]==nums[i-1]){
//                nums[i-1]=101;
//                len-=1;
//            }
//        }
//        Arrays.sort(nums);
//        return len;
//    }

    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
