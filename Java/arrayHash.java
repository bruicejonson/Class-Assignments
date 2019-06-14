import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class arrayHash {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
    //Part 1
        ArrayList<String>animals = new ArrayList<>();
        animals.add("Monkey's");
        animals.add("Tiger's");
        animals.add("Dolphin's");
        animals.add("Whale's");
        animals.add("Lion's");

        String favorite = animals.get(2);
        for( String a : animals){
            if(a.equals(favorite)) {
                System.out.println("I love " + a);
            }else{
                System.out.println("No I dont care for " + a);
            }
        }

    // Part 2
        char answer;
        do {
            System.out.print("Please enter your name: ");
            String nameA = scanner.nextLine();
            System.out.print("Please enter your age: ");
            String ageA = scanner.nextLine();
            System.out.print("Please enter your Hometown: ");
            String hometownA = scanner.nextLine();
            System.out.print("Please enter your Favorite Food: ");
            String favoriteFoodA = scanner.nextLine();

            HashMap<String, String> person = new HashMap<>();
            person.put("Name", nameA);
            person.put("Age", ageA);
            person.put("Hometown", hometownA);
            person.put("Favorite Food", favoriteFoodA);

                        for (String s : person.keySet()) {
                switch (s) {
                    case "Name":
                        System.out.println("This is " + person.get(s));
                        break;
                    case "Age":
                        System.out.println("They are " + person.get(s) + " years old");
                        break;
                    case "Hometown":
                        System.out.println("Their Hometown is " + person.get(s));
                        break;
                    case "Favorite Food":
                        System.out.println("Their favorite food is " + person.get(s));
                        break;
                }

            }
            System.out.print("Do you want to change your identity? ");
             answer = scanner.nextLine().toLowerCase().charAt(0);
        }while (answer == 'y');
    //Part 3
        char answer2;
       do {
            System.out.print("Please enter a random number: ");
            int num1 = scanner.nextInt();
            System.out.print("Please enter 2nd number: ");
            int num2 = scanner.nextInt();
            System.out.print("Please enter your 3rd number: ");
            int num3 = scanner.nextInt();
            System.out.print("Please enter your 4th number: ");
            int num4 = scanner.nextInt();
            System.out.print("Please enter your last number: ");
            int num5 = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(num1);
            numbers.add(num2);
            numbers.add(num3);
            numbers.add(num4);
            numbers.add(num5);

            int sum = 0;
            int product = 1;
            for (int i : numbers) {
                sum += i;
                product *= i;
            }
            System.out.println("The Sum of all those numbers is: " + sum);
            System.out.println("The Product of all those numbers is: " + product);
            System.out.println("The largest number you entered is: " + Collections.max(numbers));
            System.out.println("The Smallest number you entered is: " + Collections.min(numbers));

            System.out.print("Do you want to input in new numbers ? ");
            answer2 = scanner.next().toLowerCase().charAt(0);
        }while ( answer2 == 'y');
    //Part 4

            HashMap<String, String> cars = new HashMap<>();
            cars.put("civic", "Honda");
            cars.put("camry", "Toyota");
            cars.put("corolla", "Toyota");
            cars.put("accord", "Honda");
            cars.put("wrangler", "Jeep");
            cars.put("accent", "Hyundai");
            cars.put("genesis", "Hyundai");
        char answer3;
        do {
            System.out.print("What car model are you looking for : ");
            String ask = scanner.next().toLowerCase();
            if (cars.containsKey(ask)) {
                System.out.println("Oh your looking for a " + cars.get(ask) + " they are right this way");
                System.out.print("Do you want to look for another car model? ");
                answer3 = scanner.next().toLowerCase().charAt(0);
            } else {
                System.out.println("Sorry we dont have that model in stock");
                System.out.print("Do you want to look for another car model? ");
                answer3 = scanner.next().toLowerCase().charAt(0);
            }
        }while ( answer3 == 'y');

    }

}
