import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //making my numbers from 1 - 100
        Integer[] numbers = new Integer[101];
        System.out.print("Prime Numbers between 1 & 100 : ");
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            if (isPrime(numbers[i]) == true) {
                System.out.print(numbers[i] + " ");
            }
        }
        //this ia to ask the user to input a user number
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        char again;
        do {
            System.out.println("Input a number:");
            int num = scanner.nextInt();

            if (isPrime(num) == true) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is not a Prime Number.");
            }

            System.out.println("Want to try another number?");
            again = scanner.next().toLowerCase().charAt(0);
        }while (again == 'y');
        System.out.println("Stay Mathmatical !!!");
    }
    //prime number method
    public static boolean isPrime(int x){
        if(x == 1) return false;
        for (int m = 2; m <= x/2; ++m) {
            if (x % m == 0) {
                return false;
            }
        }
        return true;
    }
}
