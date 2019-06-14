import habitat.Forest;
import habitat.Marine;
import habitat.Safari;
import java.util.Scanner;

public class Zoo {
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("We currently have 63 animals within our 3 Zoo Habitats");
        char repeat;
        do {
            System.out.println("     Which habitat would you like to visit ?");
            System.out.println("          Marine, Safari, or Forest: ");
            char visit = scanner.nextLine().toLowerCase().charAt(0);
            if(visit == 'f'){
                Forest f = new Forest();
                f.info();
            } else if(visit == 'm'){
                Marine m = new Marine();
                m.info();
            }else{
                Safari s = new Safari();
                s.info();
            }

            System.out.println("Do you want to experience another habitat ? ");
            repeat = scanner.nextLine().toLowerCase().charAt(0);
        }while (repeat == 'y');
        System.out.println("Thanks for Coming to the Danger Zone Zoo !!!");
    }
}

