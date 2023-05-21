import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.*;

/**
 * @author 24542
 * @Description: 10. 正则表达式匹配
 * @CreateDate: 2023/5/19
 */


public class RegExpMatching {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(RegExpMatching.class);
        logger.info("isMatch(\"abc\", \"abcdef\")    {}",isMatch("abc", "abcdef"));
    }

    public static boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            if (matcher.group(0).length() == s.length()) {
                return true;
            } else return false;
        }
        return false;
    }
}
