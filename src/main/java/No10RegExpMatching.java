import org.slf4j.LoggerFactory;

import java.util.regex.*;

/**
 * @author 24542
 * @Description: 10. 正则表达式匹配
 * @CreateDate: 2023/5/19
 */


public class No10RegExpMatching {
    public static void main(String[] args) {
        LoggerFactory.getLogger(No10RegExpMatching.class).
                info("({} isMatch {}) ? {}", "abc", "abcdef", isMatch("abc", "abcdef"));
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
