import java.util.Scanner;

public class Soal1 {
    public static void main (String[] args) {
        try {
            // Instansiasi object userInput untuk melakukan input ke variabel n
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter your number:");
            long n = userInput.nextLong();

            System.out.println("\n" + n + " can be fitted into:");
            // Mengecek nilai minimum dan maximum dari 4 tipe data numerik
            // serta membandingkannya dengan input yang diassign ke n
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println(">> Byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println(">> Short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println(">> Integer");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println(">> Long");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("\nYour input cannot be fitted into any primitive numeric data types!\n");
        }
    }
}
