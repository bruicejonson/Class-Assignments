import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Welcome to your Personal Calculator !!!");
        System.out.println("-------------------------------------");
        char again;
        do {
            System.out.println("Enter your first number:");
            int n1 = scanner.nextInt();
            System.out.println("Enter your second number:");
            int n2 = scanner.nextInt();
            System.out.println("-------------------------------------");
            System.out.println("Which method would you like to use ?");
            System.out.println("[Add, Subtract, Multiply, Divide]");
            System.out.println("-------------------------------------");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice == 'a') {
                System.out.println("-------------------------------------");
                System.out.println(n1 + " + " + n2 + " = " + add(n1, n2));
            } else if (choice == 's') {
                System.out.println("-------------------------------------");
                System.out.println(n1 + " - " + n2 + " = " + subtract(n1, n2));
            } else if (choice == 'm') {
                System.out.println("-------------------------------------");
                System.out.println(n1 + " x " + n2 + " = " + multiply(n1, n2));
            } else if (choice == 'd') {
                System.out.println("-------------------------------------");
                System.out.println(n1 + " / " + n2 + " = " + divide(n1, n2));
            }
            System.out.println("Do you want to use the calculator again?");
            again = scanner.next().toLowerCase().charAt(0);
        }while (again == 'y');
        System.out.println("-------------------------------------");
        System.out.println("Thanks for using your personal Calculator !!!");
        System.out.println("-------------------------------------");
    }
    public static int add(int x, int y){
       int z = x + y;
       return z;
    }
    public static int subtract(int x, int y){
        int z = x - y;
        return z;
    }
    public static int multiply(int x, int y){
        int z = x*y;
        return z;
    }
    public static double divide(double x, double y){
        return x/y;
    }
}
