import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Methods {
    public static double income() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------");
        Thread.sleep(500);
        System.out.println("What is your monthly income: ");
        Thread.sleep(500);
        System.out.println("----------------------------------");
        Thread.sleep(500);
        double income = scanner.nextDouble();
         return income;
    }
    public static double carNote() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------");
        Thread.sleep(500);
        System.out.println("How much is your monthly car note: ");
        Thread.sleep(500);
        System.out.println("-------------------------------------");
        Thread.sleep(500);
        double note = scanner.nextDouble();
        return note;
    }
    public static double carInsurance() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        Thread.sleep(500);
        System.out.println("How much is your monthly car insurance: ");
        Thread.sleep(500);
        System.out.println("-------------------------------------------");
        Thread.sleep(500);
        double insure = scanner.nextDouble();
        return insure;
    }
    public static double phone() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        Thread.sleep(500);
        System.out.println("How much is your monthly phone bill: ");
        Thread.sleep(500);
        System.out.println("----------------------------------------");
        Thread.sleep(500);
        double phone = scanner.nextDouble();
        return phone;
    }
    public static double health() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        Thread.sleep(500);
        System.out.println("How much do you spend a month on health insurance: ");
        Thread.sleep(500);
        System.out.println("------------------------------------------------------");
        Thread.sleep(500);
        double health = scanner.nextDouble();
        return health;
    }
    public static double gas() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        Thread.sleep(500);
        System.out.println("How much do you roughly spend a month on gas: ");
        Thread.sleep(500);
        System.out.println("-------------------------------------------------");
        Thread.sleep(500);
        double gas = scanner.nextDouble();
        return gas;
    }
    public static double meal() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        Thread.sleep(500);
        System.out.println("What do you spend a month on food: ");
        Thread.sleep(500);
        System.out.println("--------------------------------------");
        Thread.sleep(500);
        double food = scanner.nextDouble();
        return food;
    }
    public static double other() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        Thread.sleep(500);
        System.out.println("What is the total spending of your other reoccurring bills: ");
        Thread.sleep(500);
        System.out.println("----------------------------------------------------------------");
        Thread.sleep(500);
        double other = scanner.nextDouble();
        return other;
    }
    public static void closeApp() throws InterruptedException {
        System.out.println("--------------- Personal Budget ------------------");
        Thread.sleep(1000);
        System.out.println("  Thanks for trying our personal budget app !!!");
        Thread.sleep(1000);
        System.out.println("--------------------------------------------------");
        Thread.sleep(1000);
    }
    public static  void menu1() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new FileReader("menu1.txt"));
        for(int i = 0; i < 9; i++) {
            System.out.println(reader.readLine());
            Thread.sleep(500);
        }
    }
    public static void menu2() throws IOException, InterruptedException {
        BufferedReader buffer = new BufferedReader(new FileReader("menu2.txt"));
        for(int i = 0; i < 11; i++) {
            System.out.println(buffer.readLine());
            Thread.sleep(500);
        }
    }
}
