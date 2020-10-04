import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = scanner.nextLine();
        str1 = str1.toLowerCase();
        char[] chars = str1.toCharArray();
        str1 = new String(chars, 0, 1);
        str1 = str1.toUpperCase();
        String str2 = new String(chars, 1, (chars.length) - 1);
        System.out.println(str1.concat(str2));


    }
}
