import java.util.Arrays;

public class RemoveElements {
    public static int removeElement(int[] A, int elem) {
        int len = A.length;
        for (int i = 0 ; i< len; ++i){
            while (A[i]==elem && i< len) {
                A[i]=A[--len];
            }
        }
        System.out.println(Arrays.toString(A));
        return len;
    }

    public static void main(String[] args) {
        int[]nums = {3,3};
        int val=3;
        System.out.println(removeElement(nums,val));
    }
}


