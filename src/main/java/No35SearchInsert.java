import org.slf4j.LoggerFactory;

/**
 * @Description: TODO
 * @CreateDate: 2023/5/29
 */


public class No35SearchInsert {
    public static void main(String[] args) {
        LoggerFactory.getLogger(No35SearchInsert.class)
                .info("索引值为 {}", searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int temp = nums.length;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (target <= nums[mid]) {
                temp = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return temp;
    }
}
