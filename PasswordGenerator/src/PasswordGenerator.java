import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String symbol = "!@#$%^&*(){}<>[]";
        String combination = upper + lower + number + symbol;

        int len = 8;
        char[] password = new char[len];

        Random r = new Random();
        for (int i = 0; i < len; i++)
        {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password is: "+ new String(password));
    }
}
