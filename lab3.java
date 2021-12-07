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





        //if (password.length() >= 8) {
            //if (m1.find()) {
                //if (m2.find()) {
                    //if (m3.find()) {
                        //if (m4.find()) {
                            //System.out.println("Your password is amazing");
                        //}
                    //}
        //if (password.length() >= 8 && m1.find() && m2.find() && m3.find() && m4.find()) {
            //System.out.println("Your password is amazing");
        //} else if (){
            //System.out.println("No lowercase letters found. Enter another password.");
        //} else if (){
            //System.out.println("No uppercase letters found. Try again.");
        //} else if (){
            //System.out.println("No low line found. Change your password.");
        //} else if (){
            //System.out.println("No numbers found. Modify the password.");
        //} else if (password.length() <= 8){
            //System.out.println("Length must be more than 7 symbols");

//Pattern lowCase = Pattern.compile("[a-z]+");
            //Pattern upCase = Pattern.compile("[A-Z]+");
            //Pattern lowLine = Pattern.compile("[_]+");
            //Pattern num = Pattern.compile("[\\d]+");

// Matcher m1 = lowCase.matcher(password);
            // Matcher m2 = upCase.matcher(password);
            // Matcher m3 = lowLine.matcher(password);
            // Matcher m4 = num.matcher(password);





        //if (password.length() >= 8) {
            //if (m1.find()) {
                //if (m2.find()) {
                    //if (m3.find()) {
                        //if (m4.find()) {
                            //System.out.println("Your password is amazing");
        //} else {
          //System.out.println("Your password is not strong");
                       // }
                    //}
               // }
            //}



                //System.out.println("Your password is amazing");
            //} else {
                //System.out.println("Your password is not strong");
            //} else if (m.find()){
                //System.out.println("Length must be more than 7 symbols");
            //}
        //}
        //System.out.println("Password accepted.");
    //}
//}

//System.out.println(m1.find());
//System.out.println(m2.find());
//System.out.println(m3.find());
//System.out.println(m4.find());
