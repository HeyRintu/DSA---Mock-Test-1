import java.util.Arrays;

public class Main {
    public static void moveZeroesToEnd(int[] nums) {
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertIndex++] = nums[i];
            }
        }
        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroesToEnd(nums);
    }
}