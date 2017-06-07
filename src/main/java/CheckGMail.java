import java.util.regex.Pattern;




public class CheckGMail {
    public static void main(String[] args) {
        String input = "email1@gmail.com,email2@gmail.com,email3@gmail.com,email4@gmail.com";
        System.out.println(isAGMailAddress(input));

    }
    private static boolean isAGMailAddress(String input){
        return Pattern.matches("^(([a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@(?:gmail\\.com))?(?:,|$))+$", input);
    }
}
