package Store;

import java.io.IOException;
import java.util.ArrayList;

public class JimmyJohns extends Store {
    boolean veggieOptions;
    private ArrayList<String> sub;
    public JimmyJohns(String name, String address,boolean veggieOptions, boolean openWeekends, String openTime, String closingTime) {
        super(name, address, openWeekends, openTime, closingTime);
        this.veggieOptions = veggieOptions;
        sub = new ArrayList<String>();
        loadSubs();
    }
    public void name(){
        System.out.println("The Sandwhich Shop's name is "+ name);
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
    private void loadSubs()
    {
        try
        {
            Utils.loadStringsToArray(this.sub,"SubMenue.txt");
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.sub = new ArrayList<String>();

        }
    }
    public void seeMenue(){
        for(String sub : this.sub) System.out.println(sub);
    }
}
