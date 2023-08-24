package ss19_string_regex.exercise.bai_1_validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;
    private static Matcher matcher;
    public static final String CLASS_NAME_REGEX = "^[CAP]+\\d{4}+[GHIK]";
    public ClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
