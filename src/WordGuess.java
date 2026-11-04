import java.util.Scanner;
public class WordGuess {
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);
        System.out.println("Introduce una letra o"+
                " completa la palabra:");
        String inputString;
        MagicWord magic = new MagicWord();
        boolean win = false;
        int cont = 1;
        do {
            System.out.println("Intento n." + cont);
            inputString = inputVal.next();
            win = magic.check(inputString);
            if (!win) {
                System.out.println(magic.getUnderscoreString());
            }
            cont++;
        } while (!win);
        System.out.println("Has Ganado !");


    }
}