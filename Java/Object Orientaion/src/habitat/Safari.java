package habitat;

import animals.Elephants;
import animals.Giraffes;
import animals.Hyenas;
import animals.Lions;

import java.util.Scanner;

public class Safari {
    Elephants elephant = new Elephants("Chordata","Animalia",8,"Savannahs, Deserts, Etc.");
    Lions lion = new Lions("Chordata","Animalia",6,"Grasslands & Savannahs");
    Giraffes giraffe = new Giraffes("Chordata","Animalia",3,"Savannahs & Woodlands");
    Hyenas hyena = new Hyenas("Chordata","Animalia",8,"Grasslands, Woodlands, Etc.");
    String description = "We have a collection of a few of the most amazing safari animals.\n           " +
            "  There are 25 animals in this Habitat\n " +
            "   Which include Elephants, Lions, Giraffes, and Hyenas";

    public void info(){
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which of these animal's do you want to learn more about ?");
        char more = scanner.nextLine().toLowerCase().charAt(0);

        if( more == 'e'){
        elephant.animalInfo();
        elephant.speak();
        elephant.eating();
        }else if (more == 'l'){
         lion.animalInfo();
         lion.speak();
         lion.eating();
        }else if (more == 'g'){
         giraffe.animalInfo();
         giraffe.speak();
         giraffe.eating();
        }else  if(more == 'h'){
          hyena.animalInfo();
          hyena.speak();
          hyena.eating();
        }

    }
}
