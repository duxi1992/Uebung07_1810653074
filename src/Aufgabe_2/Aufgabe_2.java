package Aufgabe_2;

;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;


public class Aufgabe_2 {

    public static void main (String [] args){

        try {
            while (true) {


                String a = showInputDialog("Bitte geben sie ein Wort ein");

                // Den Inhalt von Strings könnte man auch mit equals überprüfen aber da ist mir nichts mit dem integer
                // Wert und der NumberFormatException eingefallen, deshalb diese Lösung

                int b = Integer.parseInt(a);

                System.err.println("Zahlen sind ungültige Werte");

            }
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Danke für ihre Eingabe!");


            }
        }
    }

            // ich hab die Aufgabe so verstanden, bin aber nicht sicher ob das richtig ist.