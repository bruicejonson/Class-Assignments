import Store.Bookstore;
import Store.CircleK;
import Store.JimmyJohns;
import Store.NotJustCoffee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookstore bookstore = new Bookstore("Mind Million","2310 Make A Book Lane, Charlotte NC,28269",true,true,"8:00 a.m.","5:00 p.m.");
        NotJustCoffee notJustCoffee = new NotJustCoffee("NotJustCoffee","2230 Park Road",true,true,"7:00 a.m.","9:00 p.m.");
        JimmyJohns jimmyJohns = new JimmyJohns("Jimmy John's","230 S Tryon St, Charlotte, NC 28202",true,true,"10:30 a.m.","10:00 p.m.");
        CircleK circleK = new CircleK("Circle K","701 N Graham St",true,"24-7","Never");
        char again;
        do {
            System.out.println("    Which Store Name Do You Want To Know ?");
            System.out.println("(B)ookstore, (C)offee Shop, (S)ub Shop or (G)as Station:");
            char name = scanner.next().toLowerCase().charAt(0);
            if (name == 'b') {
                bookstore.name();
            } else if (name == 'c') {
                notJustCoffee.name();
            } else if (name == 's') {
                jimmyJohns.name();
            } else if (name == 'g') {
                circleK.name();
            }
            System.out.println("   Which Store's address do you want?");
            System.out.println("(B)ookstore, (C)offee Shop, (S)ub Shop or (G)as Station:");
            char add = scanner.next().toLowerCase().charAt(0);
            if (add == 'b') {
                bookstore.address();
            } else if (add == 'c') {
                notJustCoffee.address();
            } else if (add == 's') {
                jimmyJohns.address();
            } else if (add == 'g') {
                circleK.address();
            }
            System.out.println("   Which Store's Open and Closing time do you want?");
            System.out.println("(B)ookstore, (C)offee Shop, (S)ub Shop or (G)as Station:");
            char time = scanner.next().toLowerCase().charAt(0);
            if (time == 'b') {
                bookstore.openTime();
                bookstore.closingTime();
            } else if (time == 'c') {
                notJustCoffee.openTime();
                notJustCoffee.closingTime();
            } else if (time == 's') {
                jimmyJohns.openTime();
                jimmyJohns.closingTime();
            } else if (time == 'g') {
                circleK.openTime();
                circleK.closingTime();
            }
            System.out.println("   Which Store's menu do you want to see?");
            System.out.println("(B)ookstore, (C)offee Shop, (S)ub Shop or (G)as Station:");
            char stuff = scanner.next().toLowerCase().charAt(0);
            if (stuff == 'b') {
                bookstore.seeBook();
            } else if (stuff == 'c') {
                notJustCoffee.seeMenue();
            } else if (stuff == 's') {
                jimmyJohns.seeMenue();
            } else if (stuff == 'g') {
                circleK.seeServices();
            }
            System.out.println("Do you want to Know how many Books are in the BooksStore?");
            char total = scanner.next().toLowerCase().charAt(0);
            if (total == 'y') {
                System.out.println("There are " + bookstore.numBooks() + " books in Mind Million.");
            }
            System.out.println("Which Book do you want to search for ?");
            String search = scanner.next().toLowerCase();
            System.out.println("These are books close to what you want: ");
            System.out.println(String.join(", ", bookstore.filterSearch(search)));

            System.out.println("Would you like to redo all the question?");
            again = scanner.next().toLowerCase().charAt(0);
        }while (again == 'y');
        System.out.println("Knowledge is POWER, and your looking pretty weak....");


        //This gives you a boolean of true or false if I have that book
        // System.out.println(bookstore.searchBooks("Just Enough Database"));





    }

}
