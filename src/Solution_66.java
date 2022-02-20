import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution_66 {
    public static void main(String[] args) {
        int[] digits = new int[100];
        int i;
        for(i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                System.out.println(digits);
            } else
                digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(result);
    }
}
