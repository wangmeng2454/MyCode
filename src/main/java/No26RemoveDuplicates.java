import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @Description: 26. 删除有序数组中的重复项
 * @CreateDate: 2023/5/22
 */
public class No26RemoveDuplicates {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(No26RemoveDuplicates.class);
        int[] ints = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        logger.info("[0,0,1,1,1,2,2,3,3,4]删除重复项后的长度为 - {}", removeDuplicates(ints));
        String str = Arrays.toString(ints);
        logger.info("数组为 - {}", str);
    }

    public static int removeDuplicates(int[] nums) {
        int newLen = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[newLen++] = nums[i];
            }
        }
        return newLen;
    }
}
