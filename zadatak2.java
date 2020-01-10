import java.util.Scanner;

public class zadatak2 {

    public static void main (String[] args) {
        Scanner broj = new Scanner(System.in);
        int a = broj.nextInt();
        int b = broj.nextInt();
        String operacija = broj.next();

        switch (operacija) {
            case "s" : System.out.println(a + b); break;
            case "o" : System.out.println(a - b); break;
            case "m" : System.out.println(a * b); break;
            case "d" : System.out.println(a / b); break;
        }

    }
}
