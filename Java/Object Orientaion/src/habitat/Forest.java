package habitat;

import animals.Orangutans;
import animals.Pandas;
import animals.Sloth;
import animals.Toucans;

import java.util.Scanner;

public class Forest  {
    Toucans toucan = new Toucans("Chordata","Animalia",4,"Trees");
    Orangutans orangutan = new Orangutans("Chordata","Animalia",7,"Trees");
    Pandas panda = new Pandas("Chordata","Animalia",3,"Bamboo Forest");
    Sloth sloth = new Sloth("Chordata","Animalia",2,"Trees");
    String description =  "We have a collection of a few of the most amazing forest animals.\n           There are 16 animals in this Habitat\n " +
            "   Which include Toucans, Orangutans, Pandas, and Sloths";

    public void info(){
        System.out.println(description);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which of these animal's do you want to learn more about ?");
        char more1 = scanner.nextLine().toLowerCase().charAt(0);

        if( more1 == 't'){
            toucan.animalInfo();
            toucan.speak();
            toucan.eating();
        }else if (more1 == 'o'){
            orangutan.animalInfo();
            orangutan.speak();
            orangutan.eating();
        }else if (more1 == 'p'){
            panda.animalInfo();
            panda.speak();
            panda.eating();
        }else  if(more1 == 's'){
            sloth.animalInfo();
            sloth.speak();
            sloth.eating();
        }
    }
}
