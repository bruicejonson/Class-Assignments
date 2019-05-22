import java.awt.*;
import java.util.*;

public class LoopProject {
    public static void main(String[] args) throws InterruptedException {
//        AsciiChars.printNumbers();
//        AsciiChars.printLowerCase();
//        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.print("Do you wish to continue to the interactive portion? ");
        if(scanner.next().toLowerCase().charAt(0) != 'y') return;

        do {
            int[] lottery = new int[6];
            System.out.print("What's your favorite color (hex code)? ");
            while(true) {
                try {
                    Color c = Color.decode(scanner.next());
                    lottery[0] = 0;
                    lottery[0] += c.getRed();
                    lottery[0] += c.getGreen();
                    lottery[0] += c.getBlue();
                    lottery[0] /= 3;
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("What's your favorite color (hex code)? ");
                }
            }

            System.out.print("What's your favorite sport? ");
            String sport = scanner.next();

            System.out.print("Last 2 digits of your car's model year: ");
            while(true) {
                try {
                    lottery[2] = Integer.parseInt(scanner.next());
                    break;
                } catch(NumberFormatException e) {
                    System.out.print("Last 2 digits of your car's model year: ");
                }
            }

            System.out.print("Favorite pet? ");
            String pet = scanner.next();

            System.out.print("Favorite food? ");
            lottery[4] = scanner.next().charAt(0);

            System.out.print("Whats your hobby? ");
            String hobby = scanner.next();
            lottery[5] = hobby.charAt(hobby.length() - 1);

            lottery[1] = sport.length() >= 3 ? sport.charAt(2) : sport.charAt(0);
            lottery[3] = 0;
            for(char c : pet.toCharArray()) {
                lottery[3] += c;
            }
            lottery[3] /= pet.length();


            Set<Integer> noDupes = new HashSet<>();
            for(int i : lottery) noDupes.add(i % 75);
            while(noDupes.size() < lottery.length) noDupes.add(new Random().nextInt(75) + 1);
            Integer[] draw = noDupes.toArray(new Integer[6]);
            Arrays.sort(draw);

            System.out.println(String.format(
                    "Lottery numbers: %d, %d, %d, %d, %d, Magic ball: %d",
                    draw[0], draw[1], draw[2],
                    draw[3], draw[4], draw[5]));

            int[] winning = new int[6];
            for ( int i =0; i < winning.length; i++) {
                int n = new Random().nextInt(75) + 1;
                winning[i] = n;
            }
                for(int w : winning) noDupes.add(w % 75);
                while(noDupes.size() < lottery.length) noDupes.add(new Random().nextInt(75) + 1);
                Integer[] win = noDupes.toArray(new Integer[6]);
                Arrays.sort(win);
            Thread.sleep(1000);
            System.out.println("And the winning lottery numbers are: ");
            Thread.sleep(1000);
            System.out.print(win[0]+ ", ");
            Thread.sleep(1000);
            System.out.print(win[1]+ ", ");
            Thread.sleep(1000);
            System.out.print(win[2]+ ", ");
            Thread.sleep(1000);
            System.out.print(win[3]+ ", ");
            Thread.sleep(1000);
            System.out.println(win[4]);
            Thread.sleep(1000);
            System.out.println("Magic ball:");
            Thread.sleep(1000);
            System.out.println(String.format("%d",
                    win[5] ));
            Thread.sleep(1000);
            System.out.print("Would you like to try and win the lottery again? ");
        } while(scanner.next().toLowerCase().charAt(0) == 'y');
        System.out.println("Thank you for playing !!!");
    }
}