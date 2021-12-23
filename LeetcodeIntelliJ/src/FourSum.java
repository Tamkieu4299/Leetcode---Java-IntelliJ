import java.util.*;

public class FourSum {
     public static List<List<Integer>> fourSum(int[] nums, int target) {
        Hashtable<List<Integer>, Boolean> checkDist = new Hashtable<>();
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        for(int i=0; i < nums.length-2; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int l = i+1, r = j - 1, sum = target - nums[i] - nums[j];
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        List<Integer> subLst = Arrays.asList(nums[i], nums[l], nums[r], nums[j]);
                        if (checkDist.get(subLst) == null) {
                            checkDist.put(subLst, true);
                            res.add(subLst);
                        }
                        l++;
                        r--;
                    }
                    else if (nums[l] + nums[r] < sum) l++;
                    else r--;
                    }
                    l++;
                    r--;
                }
            }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,1, 2, -2};
        int target = 1;

        for(List<Integer> lst: fourSum(nums,target)) {
            for(int i = 0; i < lst.size(); i++) {
                System.out.print(lst.get(i));
            }
        }
    }
}
