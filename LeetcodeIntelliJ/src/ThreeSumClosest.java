import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int sum = 0;
        for (int i = 0; i < nums.length-2; i++) {
            int lo = i + 1, hi = nums.length - 1, sub = target - nums[i];
            if(i==0) {
                res = Math.abs(sub - (nums[lo] + nums[hi]));
                sum = nums[i]+nums[lo]+nums[hi];
            }
            else {
                if(res > Math.min(res, Math.abs(sub-(nums[lo] + nums[hi]))))sum=nums[i]+nums[lo]+nums[hi];
                res = Math.min(res, Math.abs(sub - (nums[lo] + nums[hi])));

            }
            while (lo<hi) {
                if(sub - (nums[lo] + nums[hi])<0) {
                    if(res != Math.min(res, Math.abs(sub-(nums[lo] + nums[hi]))))sum=nums[i]+nums[lo]+nums[hi];
                    res = Math.min(res, Math.abs(sub - (nums[lo] + nums[hi])));
                    hi--;
                }
                else {
                    if(res != Math.min(res, Math.abs(sub - (nums[lo] + nums[hi])))) sum=nums[i]+nums[lo]+nums[hi];
                    res = Math.min(res, Math.abs(sub - (nums[lo] + nums[hi])));

                    lo++;
                }
            }
        }
        return sum;

        /*
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
         */

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] nums = new int[input.nextInt()];
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();

        System.out.println(threeSumClosest(nums, target ));

    }
}
