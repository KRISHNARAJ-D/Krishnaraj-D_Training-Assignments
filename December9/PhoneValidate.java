package december9;

import java.util.regex.*;

public class PhoneValidate {
    public static void main(String[] args) {
        String regex = "(\\+?\\d{1,3})-\\d{3}-\\d{3}-\\d{4}";

        String[] phones = { "001-765-989-3421", "+1-456-765-9345", "123-45-678" };

        for (String p : phones) {
            if (p.matches(regex)) {
                System.out.println(p + " → Valid");
            } else {
                System.out.println(p + " → Invalid");
            }
        }
    }
}
