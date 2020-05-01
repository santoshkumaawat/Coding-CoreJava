package BasicTasks;

/*1) create method to accept n no of characters and
 count the vowels in it.
 */
public class Vowel {

    private static int totalVowel;
    private static int totalConsonant;

    public static void count(char... v) {
        totalVowel = 0;
        totalConsonant = 0;
        for (char ch : v) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                totalVowel++;
            } else {
                totalConsonant++;
            }
        }
        System.out.println("Total no. of Vowel is " + totalVowel);
        System.out.println("Total no. of Consonant is " + totalConsonant);
    }

    public static void main(String[] args) {
        count('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        count('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    }
}
