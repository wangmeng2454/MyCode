import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Description: 27. 移除元素
 * @CreateDate: 2023/5/22
 */


public class RemoveElement {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(RemoveElement.class);
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        logger.info("[0,1,2,2,3,0,4,2]移除数值为2后的长度为 - {}", removeElement(ints, 2));
        logger.info("数组为 - {}", Arrays.toString(ints));
    }

    public static int removeElement(int[] nums, int val) {
        int newPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newPoint++] = nums[i];
            }
        }
        return newPoint;
    }
}
