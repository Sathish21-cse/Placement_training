package Weak_3.day_1;
import java.util.regex.*;
public class regexpatter {


        public static void main(String[] args) {

            String text = """
        Email: user01@gmail.com
        Backup email: support.team@gmail.com
        Phone: 9876543210
        Invalid phone: 123456
        Date: 12-08-2025
        Another date: 01-01-2024
        Website: https://www.example.com
        Server IP: 192.168.1.1
        Price is 450 and tax is 20
        Warning: error error occurred
        Password1: Abc@1234
        Password2: weakpass
        """;

            extract("Emails", "[a-zA-Z0-9._%+-]+@gmail\\.com", text);
            extract("Valid Phones", "\\b[6-9][0-9]{9}\\b", text);
            extract("Dates", "\\b\\d{2}-\\d{2}-\\d{4}\\b", text);
            extract("Website URLs", "https?://[\\w.-]+", text);
            extract("IP Address", "\\b(\\d{1,3}\\.){3}\\d{1,3}\\b", text);
            extract("Numbers", "\\b\\d+\\b", text);
            // extract("Repeated Words", "\\b(\\w+)\\s+\\1\\b", text);
            // extract("Strong Passwords",
            //         "\\b(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}\\b",
            //         text);
        }

        static void extract(String title, String regex, String text) {
            System.out.println("\n" + title + ":");
            Matcher m = Pattern.compile(regex).matcher(text);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
}

