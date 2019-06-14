package habitat;

import animals.Narwhals;
import animals.Octopus;
import animals.Otters;
import animals.Walrus;

import java.util.Scanner;

public class Marine {
   Octopus octopus = new Octopus("Mollusca","Animalia",10,"Sea Bed");
   Otters otter = new Otters("Chordata","Animalia",3,"Coastal Waters");
   Walrus walrus = new Walrus("Chordata","Animalia",6,"Shallow Waters");
   Narwhals narwhal = new Narwhals("Chordata","Animalia",3,"Arctic Waters");
    String description =  "We have a collection of a few of the most amazing marine animals.\n           " +
            "  There are 22 animals in this Habitat\n " +
            "  Which include Octopuses, Otters, Walruses, and Narwhals";

    public void info(){
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which of these animal's do you want to learn more about ?");
        char more2 = scanner.nextLine().toLowerCase().charAt(3);

        if( more2 == 'o'){
            octopus.animalInfo();
            octopus.speak();
            octopus.eating();
        }else if (more2 == 'e'){
            otter.animalInfo();
            otter.speak();
            otter.eating();
        }else if (more2 == 'r'){
            walrus.animalInfo();
            walrus.speak();
            walrus.eating();
        }else  if(more2 == 'w'){
            narwhal.animalInfo();
            narwhal.speak();
            narwhal.eating();
        }
    }
}
