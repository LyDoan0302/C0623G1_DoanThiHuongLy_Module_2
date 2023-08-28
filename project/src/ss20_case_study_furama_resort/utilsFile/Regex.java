package ss20_case_study_furama_resort.utilsFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMPLOYEE_ID_REGEX = "^NV-\\d{4}$";
    private static final String CUSTOMER_ID_REGEX = "^KH-\\d{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
    private static final String PRIVATE_ID_REGEX = "^(\\d{9}|\\d{12})$";
    private static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "\"^(?=.{6,32}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$\")";
    public static boolean employeeIdRegex(String empId) {
        pattern = Pattern.compile(EMPLOYEE_ID_REGEX);
        matcher = pattern.matcher(empId);
        return matcher.matches();
    }
    public static boolean customerIdRegex(String cstId) {
        pattern = Pattern.compile(CUSTOMER_ID_REGEX);
        matcher = pattern.matcher(cstId);
        return matcher.matches();
    }
    public static boolean nameRegex(String name) {
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public static boolean privateIdRegex(String privateId) {
        pattern = Pattern.compile(PRIVATE_ID_REGEX);
        matcher = pattern.matcher(privateId);
        return matcher.matches();
    }
    public static boolean phoneNumberRegex(String phoneNumber) {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static boolean emailRegex(String email) {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}