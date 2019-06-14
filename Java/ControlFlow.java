import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        char again;
        do {
            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println(String.format("Hello %s, your age is %d", username, age));
//Part 1
            if (age >= 16) {
                System.out.println("You are old enough to drive.");
            } else {
                System.out.println("You are not old enough to drive");
            }
            if (age >= 18) {
                System.out.println("You are old enough to vote.");
            } else {
                System.out.println("You are not old enough to vote.");
            }
            if (age >= 21) {
                System.out.println("You are old enough to drink.");
            } else {
                System.out.println("You are not old enough to drink.");
            }
            if (age >= 35) {
                System.out.println("You are old enough to be president.");
            } else {
                System.out.println("You are not old enough to be president.");
            }
            if (age >= 55) {
                System.out.println("You can join AARP.");
            } else {
                System.out.println("You can not join AARP.");
            }
            if (age >= 67) {
                System.out.println("You can start drawing Social Security.");
            } else {
                System.out.println("You can not start drawing Social Security.");
            }

            //do while question
            System.out.print("Redo Answers ? (Y)es or (N)o: ");
            again = scanner.next().toLowerCase().charAt(0);
        } while (again == 'y');

        //Part 2

        // prompt and read employment
        System.out.print("Enter your employment as (E)mployed, (U)nemployed, or (S)chool: ");
        char employment = scanner.next().toLowerCase().charAt(0);

        // prompt and read a vehicle
        System.out.print("Enter your vehicle as (C)ar, (T)ruck, (S)uv, or (N)one): ");
        char vehicle = scanner.next().toLowerCase().charAt(0);

        switch (employment) {
            case 'e':
                System.out.println("You are Employed");
                break;
            case 'u':
                System.out.println("You are Unemployed");
                break;
            case 's':
                System.out.println("You are in School");
                break;

        }
        switch (vehicle) {
            case 'c':
                System.out.println("You own a car");
                break;
            case 't':
                System.out.println("You own a truck");
                break;
            case 's':
                System.out.println("You own a SUV");
                break;
            case 'n':
                System.out.println("You dont own a vehicle");
                break;

        }
// Part 3 & 4

//                int[] myArray = new int[30];
//                for (int i = 0; i < myArray.length; i++) {
//                    myArray[i] = i;
//                    System.out.println(myArray[i]);
//                }
//                for (int i : myArray) {
//                    System.out.println(i);
//                }
//                for (int i = 0; i < myArray.length; i++) {
//                    myArray[i] = i * 2;
//                    System.out.println(myArray[i]);
//                }
//                for (int i : myArray) {
//                    System.out.println(i);
//                }
//                for (int i = myArray.length - 1; i >= 0; i--) {
//                    System.out.println(myArray[i]);
//                }
//                int i = 0;
//                while (i < myArray.length) {
//                    System.out.println(myArray[i++]);
//                }
//                while (i > 0) {
//                    System.out.println(myArray[--i]);
//
//                }

        branching();
        System.out.println(returning(42));
    }

    //Part 5

    public static void branching() {
        int number = 24;
        int[] myArray = new int[30];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= i;
            if (myArray[i]%2 ==0) {
                System.out.println(myArray[i]);
            }else {
            continue;
            }
            if (number == myArray[i]){
                break;
            }
        }
    }

    public static int returning(int sum) {
        int all = 0;
        int[] myArray = new int[30];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= i;
            if (myArray[i]%2 ==0) {
                all = all + i;
            }else {
                System.out.println(myArray[i]);
            }
            if (sum == myArray[i]){
                break;
            }
        }
        return all;
    }
}
