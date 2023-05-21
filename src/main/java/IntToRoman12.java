import org.slf4j.LoggerFactory;

/**
 * @Description: 12. 整数转罗马数字
 * @CreateDate: 2023/5/21
 */

public class IntToRoman12 {
    public static void main(String[] args) {
        LoggerFactory.getLogger(IntToRoman12.class).info("1994 - {}", intToRoman(1994));

    }

    public static String intToRoman(int num) {
        int index = 0;
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        while (index < nums.length) {
            while (num >= nums[index]) {
                sb.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return sb.toString();
    }
}
