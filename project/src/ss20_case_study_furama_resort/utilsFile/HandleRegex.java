package ss20_case_study_furama_resort.utilsFile;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HandleRegex {

    private static Scanner scanner = new Scanner(System.in);
    public static final String EMPLOYEE_ID_REGEX = "^NV-\\d{4}$";
    public static final String CUSTOMER_ID_REGEX = "^KH-\\d{4}$";
    public static final String NAME_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$";
    public static final String PRIVATE_ID_REGEX = "^(\\d{9}|\\d{12})$";
    public static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    public static final String EMAIL_REGEX = "^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$";
    public static final String DATE_OF_BIRTH_REGEX = "^(0[1-9]|[12]\\d|3[01])\\/(0[1-9]|1[012])\\/([12]\\d{3})$";
    public static final String ACADEMIC_LEVEL_REGEX = "Intermediate|College|University|Postgraduate$";
    public static final String POSITION_REGEX = "Receptionist|Servants|Expert|Supervisor|Manager|Director$";
    public static final String ADDRESS_REGEX = "^[#.0-9a-zA-Z\\s,-]+$";
    public static final String CUSTOMER_CLASS_REGEX = "Diamond|Platinum|Gold|Silver|Member$";
    public static final String FACILITY_ROOM_ID_REGEX = "^SVRO-\\d{4}$";
    public static final String FACILITY_VILLA_ID_REGEX = "^SVVL-\\d{4}$";
    public static final String FACILITY_HOUSE_ID_REGEX = "^SVHO-\\d{4}$";
    public static final String FACILITY_NAME_GENERAL_REGEX = "^[A-Z][a-z]*(\\s\\w*)*$";
    public static final String RENTING_TYPE_REGEX = "Year|Month|Day|Hour$";
    public static String handleRegex(String regex, String name) {
        System.out.print("Enter " + name + ": " );
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            if (pattern.matcher(input).matches()) {
                return input;
            } else {
                System.out.println("Pattern doesn't match");
                System.out.print("Enter again: ");
                input = scanner.nextLine();
            }
        }
    }
}
