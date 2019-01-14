package Aufgabe_3;

public class eigeneException extends Exception{ // erbt von einer Oberklasse " Exception"

    public eigeneException(){

          super("Das Format ihrer Mailadresse ist ungültig");       //Aufruf des Konstruktors einer Oberklasse
         }
}

