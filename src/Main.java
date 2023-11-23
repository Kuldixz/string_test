import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ciąg znaków: ");
        String str = scanner.nextLine();
        String str1 = "";
        String str2 = "";
        if(str.length() >= 3) {
            str1 = str.substring((str.length() / 2) - 1,(str.length() / 2) + 1);
            str2 = str1 + str.substring(0,( str.length() / 2) - 1) + str.substring((str.length() / 2) + 1);

        } else {
            System.out.println("Podany ciąg jest za krótki. Podaj min. 3 litery");
        }
        System.out.println(str2);
    }
}