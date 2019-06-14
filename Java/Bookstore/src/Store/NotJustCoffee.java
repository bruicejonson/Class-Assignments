package Store;

import java.io.IOException;
import java.util.ArrayList;

public class NotJustCoffee extends Store {
    boolean serveFood;
    private ArrayList<String> menue;



    public NotJustCoffee(String name, String address,boolean serveFood, boolean openWeekends, String openTime, String closingTime) {
        super(name, address, openWeekends, openTime, closingTime);
        this.serveFood = serveFood;
        menue = new ArrayList<String>();
        loadMenue();
    }
    public void name(){
        System.out.println("The Coffee Shop's name is "+ name);
    }
    public void address(){
        System.out.println( name +"'s"+ " address is "+address);
    }
    public void openWeekends(){
        System.out.println("It is "+openWeekends+" that "+name+" is open on the weekends.");
    }
    public void openTime(){
        System.out.println(name +" opens at "+openTime);
    }
    public void closingTime() {
        System.out.println(name + " closes at " + closingTime);
    }
    private void loadMenue()
    {
        try
        {
            Utils.loadStringsToArray(this.menue,"CoffeeMenue.txt");
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.menue= new ArrayList<String>();

        }
    }
    public void seeMenue(){
      for(String menu : this.menue) System.out.println(menu);
    }
}
