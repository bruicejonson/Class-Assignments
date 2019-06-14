package Store;
import java.io.IOException;
import java.util.ArrayList;

public class Bookstore extends Store {
    boolean usedBooks;
    private ArrayList<String> titles;

    public Bookstore(String name, String address, boolean usedBooks, boolean openWeekends, String openTime, String closingTime) {
        super(name, address, openWeekends, openTime, closingTime);
        this.usedBooks = usedBooks;
        titles = new ArrayList<String>();
        loadTitles();
    }

    public void name(){
        System.out.println("The Bookstore's name is "+ name);
    }
    public void address(){
        System.out.println( name +"'s"+ " address is "+address);
    }
    public void usedBooks(){
        System.out.println("It is "+usedBooks +" that "+name+" has used books.");
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
    private void loadTitles()
    {
        try
        {
            Utils.loadStringsToArray(this.titles,"BookTitles.txt");
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }
    public int numBooks(){
        return this.titles.size();
    }
    public boolean searchBooks(String title){
        return this.titles.contains(title);
    }
    public ArrayList<String> filterSearch(String letter) {
        ArrayList<String>result = new ArrayList<>();
        for (String title : this.titles) {
            if (title.toLowerCase().contains(letter)) {
                result.add(title);
            }
        }
        return result;
    }
    public void seeBook(){
        System.out.println("---------------------- "+name+" -------------------"+"\n");
        System.out.println("Book Titles -------------------------------------------"+"\n");
        for(String Book : this.titles) System.out.println(". "+Book);
        System.out.println("-------------------------------------------------------"+"\n");
        System.out.println("-------------------------------------------------------"+"\n");
    }
}
