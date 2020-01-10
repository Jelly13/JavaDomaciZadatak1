import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class zadatak3 {

    public static void main (String[] args) {
        Random rand = new Random();
        int random_broj = rand.nextInt(50);
        Scanner guess = new Scanner(System.in);
        int broj = guess.nextInt();
        while (broj !=random_broj) {
            int m = odrediBroj(random_broj, broj);
            switch (m){
                case 1:
                    System.out.println("Neverovatno! Pogodili ste tačan broj!" + random_broj);
                    break;
                case 2:
                    System.out.println("Dobar pokušaj, bili ste jako blizu!" + random_broj);
                    break;
                case 3:
                    System.out.println("Više sreće sledeći put..." + random_broj);
            }
            broj = guess.nextInt();
          //  random_broj = rand.nextInt(50);
        }

    }

    private static int odrediBroj(int random_broj, int broj) {
        int razlika = abs (random_broj - broj);
        if (random_broj == broj) {
            return (1);
        }
        else if (razlika <= 5) {
            return (2);
        } else {
            return (3);
        }
    }


}
