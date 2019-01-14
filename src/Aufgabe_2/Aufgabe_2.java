package Aufgabe_2;

;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;


public class Aufgabe_2 {

    public static void main (String [] args){

        try {
            while (true) {


                String a = showInputDialog("Bitte geben sie ein Wort ein");
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

