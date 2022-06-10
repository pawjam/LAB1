package pl.lublin.wsei.java.cwiczenia;
//komentarz - jedna linia
/* komentarz
 *  dwie linie
 */


import pl.lublin.wsei.java.cwiczenia.mylib.Account;
import java.util.Random;
import java.util.Scanner;

/**
 * author Pawel Jamro
 * version 0.1
 */
public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());

        System.out.println("Hello Java world");
        System.out.print("Linia1\n");
        System.out.print("Linia2");
        System.out.print("Linia3\n");
        int a = 3;
        double b = 3.14;
        String c = "Przykładowy tekst";
        System.out.printf("a=%d,b=%f,c=%s %n", a, b, c);
        System.out.printf("a=%d,b=%.2f,c=%20s %n", a, b, c);
        System.out.printf("a=%d,b=%f,c=%s %n", a, b, c);
        System.out.println("Nazywaliśmy to \"Witaminą B\"");
        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%.2f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        System.out.printf("arg\tLog2(arg)\tsum(arg)\t\n");
        for (double j = 1.0; j <= 20.0; j = Math.pow(2, j))
            System.out.printf("%.0f\t%.2f\t%.2f\n", j, Math.log(j) / Math.log(2), j + j);
        //Zadanie 8

        /*Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Podaj pierwszą liczbę: ");
        num1=input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        num2=input.nextInt();
        System.out.printf("Wynik dodawania liczb %d+%d=%d%n",num1,num2,num1+num2);  */
        //Zadanie 9
        /*Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.print("Podaj diwe liczby do dodania: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0)||(num2 ==0)) break;
            System.out.printf("Wynik dodawania liczb %d+%d=%d%n", num1, num2, num1 + num2);
        } while(true);  */
        //Zadanie 10

        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę do przekonwertowania: ");
        int num = input.nextInt();
        System.out.print("Dec= " + num + " BIN: " + leftPad(Integer.toBinaryString(num), '0', 9) + " HEX= " + leftPad(Integer.toHexString(num), '0', 9));

        //Zadanie 11

        int[] liczby = new int[30];
        Random rnd = new Random();
        for (int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();
        int mn = Integer.MIN_VALUE;
        int mx = Integer.MAX_VALUE;
        long avg = 0;
        for (int l : liczby) {
            System.out.println(l);
            if (l < mn) mn = l;
            if (l > mx) mx = l;
            avg += 1;
        }
        System.out.printf("MIN= %d, MAX= %d, AVG= %f",mn,mx,(float)avg/ liczby.length);
        System.out.println(Account.capitalize("\npawel Jamro"));
        String anyString="PawelJamro";
        System.out.println(Account.translit("Пащел jamro"));


    }


    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;

        return res.toUpperCase();
    }

}