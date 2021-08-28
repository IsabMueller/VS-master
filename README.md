# VS
package sample;
import java.util.Scanner;
public class userpass {

    public static void blubb(String[] args) {

        Scanner input = new Scanner(System.in);

        String user, geburtsdatum, email, pass;

        System.out.print("Geben Sie Ihren username ein: ");
        user = input.nextLine();

        System.out.print("Geben Sie Ihren Geburtsdatum ein: ");
        geburtsdatum = input.nextLine();

        System.out.print("Geben Sie Ihre Email ein: ");
        email = input.nextLine();

        System.out.print("Geben Sie Ihren Passwort ein: ");
        pass = input.nextLine();

        if(user.equals("ddanquah") && (pass.equals("Lala"))) {
            System.out.println("Willkommen ddanquah.");
        }else{
            System.out.println("Passwort ist ungültig.");
        }


    }
}
