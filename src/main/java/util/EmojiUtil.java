package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * emoji表情寻找
 *
 * @author smallone
 * @create 2020-02-06 6:57 下午
 */

public class EmojiUtil {
    public static String filterEmoji(String str) {
        String regex = "[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]";
        if (str == null) {
            return str;
        }
        Pattern emoji = Pattern.compile(regex, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        Matcher emojiMatcher = emoji.matcher(str);
        if (emojiMatcher.find()) {
            str = emojiMatcher.replaceAll("(表情)");
            return str;
        }
        return str;
    }

}
