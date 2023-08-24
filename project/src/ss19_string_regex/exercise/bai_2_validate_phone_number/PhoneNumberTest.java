package ss19_string_regex.exercise.bai_2_validate_phone_number;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] phoneNumber1 = new String[] {"(84)-(0978489648)"};
    public static final String[] phoneNumber2 = new String[] {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for(String number: phoneNumber1) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("number: " + number + " is valid: " + isValid);
        }
        for(String number: phoneNumber2) {
            boolean isValid = phoneNumber.validate(number);
            System.out.println("number: " + number + " is valid: " + isValid);
        }
    }
}
