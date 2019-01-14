package Aufgabe_3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe_3 {

public static void main (String [] args) {

    try {

        String email = JOptionPane.showInputDialog("Bitte geben Sie Ihre Emailadresse ein!");

        JOptionPane.showMessageDialog(null, "Ihre Eingabe lautet: " + email);

        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");
        Matcher m = pattern.matcher(email);
            // prüft email auf Validität

        if (!m.find()) {

            // vorgebebner Konstruktor

            throw new eigeneException();

        }
    } catch (eigeneException ex) {

        System.err.println("Das Format ihrer Mailadresse ist ungültig");


    }

}
}



