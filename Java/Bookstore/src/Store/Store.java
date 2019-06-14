package Store;
public class Store {String name;
    String address;
    boolean openWeekends;
    String openTime;
    String closingTime;

    public Store(String name,String address,boolean openWeekends,String openTime, String closingTime){
        this.name =name;
        this.address = address;
        this.openWeekends = openWeekends;
        this.openTime = openTime;
        this.closingTime = closingTime;

    }
    public Store(String name, String address,String openTime,String closingTime){
        this(name,address,false,openTime,closingTime);
    }
    public  Store(String name,String openTime, boolean openWeekends, String closingTime){
        this(name,"1234 Your dreams Lane, Charlotte NC, 28269",openWeekends,openTime,closingTime);
    }

}
