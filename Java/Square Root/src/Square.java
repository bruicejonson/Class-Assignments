import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char again;
        do {
            System.out.println("Input A Number: ");
            int num = scanner.nextInt();
            System.out.print("The individiual Digits Squared Is: ");
            System.out.println(squareDigits(num));
            System.out.println("Do You Want To Input Another Number ?");
            again = scanner.next().toLowerCase().charAt(0);
        }while (again == 'y');
        System.out.println("I Guess You Don't Like Math ...\uD83D\uDE2D.....LOSER!!!");
    }
    public static int squareDigits(int n){
        String number = String.valueOf(n);
        String x="" ;
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            x+= j * j;
        }
         return Integer.parseInt(x);
    }
}
