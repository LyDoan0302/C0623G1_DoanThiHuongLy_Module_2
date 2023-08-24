package ss19_string_regex.practice.bai_1_validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail", "ab@gmail", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email: validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid );
        }
        for(String email: invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }


    }
}
