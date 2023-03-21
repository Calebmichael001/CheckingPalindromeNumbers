import java.util.Scanner;
public class CheckingPalindromeNumbers {
    //A palindrome number is a number that remain the same when read from behind or front ( a number that is equal to reverse of number)
    // for example, 353 is palindrome because reverse of 353 is 353 (you see the number remains the same).

    // Method to prompt user to input a number/ value
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value: ");
            int num = sc.nextInt();
//Method to call and produce the output results of the process
            if (Palindrome(num)) {
                System.out.println(num + " This is a palindrome number");
            } else {
                System.out.println(num + " This is not a palindrome number try again!!!");
            }
        }
// This is a function method to check the number input value whether it applies to be a palindrome
        public static boolean Palindrome(int Num) {
            int reversedNum = 0;
            int originalNum = Num;

            while (Num != 0) {
                int remainder = Num % 10;
                reversedNum = reversedNum * 10 + remainder;
                Num = Num / 10;
            }

            return originalNum == reversedNum;
        }
    }

