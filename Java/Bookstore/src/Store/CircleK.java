package Store;

import java.io.IOException;
import java.util.ArrayList;

public class CircleK extends Store {
    private ArrayList<String> service;
    public CircleK(String name, String address, boolean openWeekends, String openTime, String closingTime) {
        super(name, address, openWeekends, openTime, closingTime);
        service = new ArrayList<String>();
        loadService();
    }
    public void name(){
        System.out.println("The Gas Station's name is "+ name);
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
    public void closingTime(){
        System.out.println(name + " closes at "+closingTime);
    }
    private void loadService()
    {
        try
        {
            Utils.loadStringsToArray(this.service,"Services.txt");
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.service = new ArrayList<String>();

        }
    }
    public void seeServices(){
        for(String menu : this.service) System.out.println(menu);
    }
}
