import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class zadatak1 {

    public static void main (String[] args) {
        Random rand = new Random();
        int random_broj = rand.nextInt(50);
        Scanner guess = new Scanner(System.in);
        int broj = guess.nextInt();
        int razlika = abs (random_broj - broj);
        if (random_broj == broj) {
            System.out.println("Neverovatno! Pogodili ste tačan broj!" + random_broj);
        }
        else if (razlika <= 5) {
            System.out.println("Dobar pokušaj, bili ste jako blizu!" + random_broj);
        } else {
            System.out.println("Više sreće sledeći put..." + random_broj);
        }

    }
}
