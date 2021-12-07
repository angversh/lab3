import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = s.next();
        s.close();


        String thePattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*_)(?=.*[A-Z])(?=\\S+$).{8,}$";
        Pattern p = Pattern.compile(thePattern);
        Matcher m = p.matcher(password);

        if (m.find()) {
            System.out.println("Alright. That's a safe one!");
        } else {
            System.out.println("Oops. Try again, this password is not secure enough.");
        }
    }
}
