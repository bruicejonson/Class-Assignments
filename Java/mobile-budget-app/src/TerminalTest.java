import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TerminalTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String mName = scanner.nextLine();
        double mIncome = 0;
        double mcarNote = 0;
        double mcarInsurance = 0;
        double mphoneBill = 0;
        double mhealthInsurance = 0;
        double mgasNeeded = 0;
        double mMeals = 0;
        double mOthers = 0;
        char again;
        do {
            System.out.println("---------------- Personal Budget -----------------");
            Thread.sleep(500);
            System.out.println("      ------- Welcome "+mName+" ---------");
            Thread.sleep(500);
            Methods.menu1();
            int choice = scanner.nextInt();
switch(choice) {
    
    case 1: 
        mIncome = Methods.income();
    case 2:
        char another;
        do {
            Methods.menu2();
            int pick = scanner.nextInt();

            if (pick == 1) {
                mcarNote = Methods.carNote();
            } else if (pick == 2) {
                mcarInsurance = Methods.carInsurance();
            } else if (pick == 3) {
                mhealthInsurance = Methods.health();
            } else if (pick == 4) {
                mphoneBill = Methods.phone();
            } else if (pick == 5) {
                mgasNeeded = Methods.gas();
            } else if (pick == 6) {
                mMeals = Methods.meal();
            } else if (pick == 7) {
                mOthers = Methods.other();
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("Do you need to add any other bills to your budget? [Y or N]");
            System.out.println("--------------------------------------------------------------");
            another = scanner.next().toLowerCase().charAt(0);
        } while (another == 'y');
        break;
    }
                DecimalFormat df =new DecimalFormat("0.00");
                double mBills = mcarNote + mcarInsurance + mhealthInsurance + mgasNeeded + mMeals + mphoneBill + mOthers;
                double mRemaining = mIncome - mBills;
                double mSavings = mRemaining * .15;
                double mnewRemaining = mRemaining - mSavings;
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("Based on the given information: ");
                System.out.print("Loading ");
                for(int i = 0; i< 20; i++ ){
                    System.out.print(".");
                    Thread.sleep(500);
                }
                Thread.sleep(500);
                System.out.println("\r"+mName+" you have $"+df.format(mBills)+" in bills per month, while making $"+df.format(mIncome)+" per month,");
                Thread.sleep(1000);
                System.out.println("Which means you have $"+df.format(mRemaining)+" after all your bills are paid per month,");
                Thread.sleep(1000);
                System.out.println("You can also put %15 of that $"+df.format(mRemaining)+" into savings which would be $"+df.format(mSavings)+",");
                Thread.sleep(1000);
                System.out.println("Leaving you with $"+df.format(mnewRemaining)+" of spending money per month.");
                Thread.sleep(1000);
                System.out.println("-----------------------------------------------------------------------------------------");

                System.out.println("Do you want to make changes to your budget ? [Y or N]");
                Thread.sleep(500);
                again = scanner.next().toLowerCase().charAt(0);

        }while (again == 'y') ;
        Methods.closeApp();
    }
}