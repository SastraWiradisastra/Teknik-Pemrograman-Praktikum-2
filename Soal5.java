import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        // Instansiasi object scanWord untuk melakukan input string
        Scanner scanWord = new Scanner(System.in);

        // Deklarasi 2 array string baru untuk menyimpan input user
        String[] words = new String[2];
        String[] tmpWords = new String[2];
        int totalLen = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter a word: ");
            words[i] = scanWord.nextLine().toLowerCase();
            tmpWords[i] = words[i];
            totalLen += words[i].length();   // Hitung panjang gabungann string
        }
        System.out.println("\n" + totalLen);

        // Melakukan pengurutan kata pada array tmpWords untuk dibanding dengan array words
        Arrays.sort(tmpWords, String.CASE_INSENSITIVE_ORDER);
        if(words[0].equals(tmpWords[0]))
            System.out.println("Yes");
        else
            System.out.println("No");

        // Inisialisasi array wordsToCapitalize untuk menyimpan kata yang sudah dikapitalisasi
        String[] wordsToCapitalize = new String[2];
        for(int i = 0; i < 2; i++){
            String cap = words[i].substring(0, 1).toUpperCase();
            wordsToCapitalize[i] = cap + words[i].substring(1);
        }
        System.out.println(wordsToCapitalize[0] + " " + wordsToCapitalize[1] + "\n");
    }
}
