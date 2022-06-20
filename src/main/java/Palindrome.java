import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znaki do sprawdzenia");
        String checkWord= scan.nextLine();

        if (isPalindrome(textConversion(checkWord))) {
            System.out.println("is palindrome");
        }else{
            System.out.println("is not");
        }

    }
    public static String textConversion(String checkWord){
        checkWord = checkWord.replaceAll(" ", "");
        String checkWordFinal = checkWord.toLowerCase();
    return checkWordFinal;
    }

    public static boolean isPalindrome(String checkWordFinal) {


        int i = 0;
        int j = (checkWordFinal.length() -1);

        while (i < j) {
            if (checkWordFinal.charAt(i) != checkWordFinal.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}