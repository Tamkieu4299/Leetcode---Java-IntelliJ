import java.util.ArrayList;
import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,2,4,3};
        System.out.println(maxArea(height));
    }
}
